$FirefoxUpload = "File upload"
$ChromeUpload = "Open"

if WinExists($FirefoxUpload) Then
  $UploadWindow = $FirefoxUpload
elseif WinExists($ChromeUpload) Then
  $UploadWindow = $ChromeUpload
else
  $UploadWindow = ""
endif

if $UploadWindow <> "" Then
  WinWait("[CLASS:#32770]","",10)
   Local $hWnd = WinWait($UploadWindow, "", 10)
    WinActivate($hWnd)
    ControlFocus($UploadWindow,"","Edit1")
  Sleep(2000)
  ControlsetText($UploadWindow,"","Edit1", $CmdLine[1])
  Sleep(4000)
  ControlClick($UploadWindow,"","Button1")
endif
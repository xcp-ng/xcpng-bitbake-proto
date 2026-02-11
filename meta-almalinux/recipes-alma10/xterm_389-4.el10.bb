
PN = "xterm"
PE = "0"
PV = "389"
PR = "4.el10"
PACKAGES = "xterm xterm-resize"


URI_xterm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xterm-389-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xterm = "
 libutempter
 freetype
 libXft
 libXmu
 libICE
 libXpm
 fontconfig
 libX11
 libXt
 ncurses-libs
 bash
 libXaw
 pcre2
 glibc
 libXext
"

URI_xterm-resize = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xterm-resize-389-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xterm-resize = "
 glibc
 ncurses-libs
"

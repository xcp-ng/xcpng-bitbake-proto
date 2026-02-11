
PN = "dialog"
PE = "0"
PV = "1.3"
PR = "52.20240101.el10"
PACKAGES = "dialog dialog-devel"


URI_dialog = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dialog-1.3-52.20240101.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dialog = "
 glibc
 ncurses-libs
"

URI_dialog-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/dialog-devel-1.3-52.20240101.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dialog-devel = "
 ncurses-devel
 dialog
 bash
 pkgconf-pkg-config
"


PN = "dialog"
PE = "0"
PV = "1.3"
PR = "52.20240101.el10"
PACKAGES = "dialog dialog-devel"


URI_dialog = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dialog-1.3-52.20240101.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dialog = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libtinfo.so.6()(64bit) ( ) libncursesw.so.6()(64bit) ( )"
RPROVIDES:dialog = "libdialog.so.15()(64bit) ( ) dialog ( =  1.3-52.20240101.el10) dialog(x86-64) ( =  1.3-52.20240101.el10)"

URI_dialog-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/dialog-devel-1.3-52.20240101.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dialog-devel = "/usr/bin/sh ( ) /usr/bin/pkg-config ( ) libdialog.so.15()(64bit) ( ) ncurses-devel ( ) dialog(x86-64) ( =  1.3-52.20240101.el10)"
RPROVIDES:dialog-devel = "dialog-devel ( =  1.3-52.20240101.el10) dialog-devel(x86-64) ( =  1.3-52.20240101.el10) pkgconfig(dialog) ( =  1.3-20240101)"

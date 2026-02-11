
PN = "ncurses"
PE = "0"
PV = "6.4"
PR = "14.20240127.el10"
PACKAGES = "ncurses ncurses-base ncurses-libs ncurses-c++-libs ncurses-devel ncurses-term ncurses-static"


URI_ncurses = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ncurses-6.4-14.20240127.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ncurses = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libtinfo.so.6()(64bit) ( ) libtic.so.6()(64bit) ( ) ncurses-libs(x86-64) ( =  6.4-14.20240127.el10)"
RPROVIDES:ncurses = "ncurses ( =  6.4-14.20240127.el10) ncurses(x86-64) ( =  6.4-14.20240127.el10)"

URI_ncurses-base = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ncurses-base-6.4-14.20240127.el10.noarch.rpm;unpack=0"
RDEPENDS:ncurses-base = ""
RPROVIDES:ncurses-base = "ncurses-base ( =  6.4-14.20240127.el10)"

URI_ncurses-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ncurses-libs-6.4-14.20240127.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ncurses-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) ncurses-base ( =  6.4-14.20240127.el10)"
RPROVIDES:ncurses-libs = "libtinfo.so.6()(64bit) ( ) libncursesw.so.6()(64bit) ( ) libpanelw.so.6()(64bit) ( ) libncurses.so.6()(64bit) ( ) libtic.so.6()(64bit) ( ) libform.so.6()(64bit) ( ) libformw.so.6()(64bit) ( ) libmenu.so.6()(64bit) ( ) libmenuw.so.6()(64bit) ( ) libpanel.so.6()(64bit) ( ) ncurses-libs(x86-64) ( =  6.4-14.20240127.el10) ncurses-libs ( =  6.4-14.20240127.el10)"

URI_ncurses-c++-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ncurses-c++-libs-6.4-14.20240127.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ncurses-c++-libs = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libncurses.so.6()(64bit) ( ) libncursesw.so.6()(64bit) ( ) libform.so.6()(64bit) ( ) libpanel.so.6()(64bit) ( ) libformw.so.6()(64bit) ( ) libmenuw.so.6()(64bit) ( ) libpanelw.so.6()(64bit) ( ) libmenu.so.6()(64bit) ( ) ncurses-libs(x86-64) ( =  6.4-14.20240127.el10)"
RPROVIDES:ncurses-c++-libs = "libncurses++.so.6()(64bit) ( ) libncurses++w.so.6()(64bit) ( ) ncurses-c++-libs(x86-64) ( =  6.4-14.20240127.el10) ncurses-c++-libs ( =  6.4-14.20240127.el10)"

URI_ncurses-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ncurses-devel-6.4-14.20240127.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ncurses-devel = "/usr/bin/sh ( ) /usr/bin/pkg-config ( ) pkgconfig ( ) libtinfo.so.6()(64bit) ( ) libform.so.6()(64bit) ( ) libpanel.so.6()(64bit) ( ) libformw.so.6()(64bit) ( ) libmenuw.so.6()(64bit) ( ) libpanelw.so.6()(64bit) ( ) pkgconfig(ncurses) ( ) libmenu.so.6()(64bit) ( ) libncurses++.so.6()(64bit) ( ) libncurses++w.so.6()(64bit) ( ) pkgconfig(form) ( ) pkgconfig(formw) ( ) pkgconfig(menu) ( ) pkgconfig(menuw) ( ) pkgconfig(ncursesw) ( ) pkgconfig(panel) ( ) pkgconfig(panelw) ( ) libtic.so.6()(64bit) ( ) ncurses-libs(x86-64) ( =  6.4-14.20240127.el10) ncurses-c++-libs(x86-64) ( =  6.4-14.20240127.el10)"
RPROVIDES:ncurses-devel = "ncurses-devel ( =  6.4-14.20240127.el10) ncurses-devel(x86-64) ( =  6.4-14.20240127.el10) pkgconfig(form) ( =  6.4.20240127) pkgconfig(formw) ( =  6.4.20240127) pkgconfig(menu) ( =  6.4.20240127) pkgconfig(menuw) ( =  6.4.20240127) pkgconfig(ncurses) ( =  6.4.20240127) pkgconfig(ncurses++) ( =  6.4.20240127) pkgconfig(ncurses++w) ( =  6.4.20240127) pkgconfig(ncursesw) ( =  6.4.20240127) pkgconfig(panel) ( =  6.4.20240127) pkgconfig(panelw) ( =  6.4.20240127) pkgconfig(tic) ( =  6.4.20240127) pkgconfig(tinfo) ( =  6.4.20240127)"

URI_ncurses-term = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ncurses-term-6.4-14.20240127.el10.noarch.rpm;unpack=0"
RDEPENDS:ncurses-term = "ncurses-base ( =  6.4-14.20240127.el10)"
RPROVIDES:ncurses-term = "ncurses-term ( =  6.4-14.20240127.el10)"

URI_ncurses-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ncurses-static-6.4-14.20240127.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ncurses-static = "ncurses-devel(x86-64) ( =  6.4-14.20240127.el10)"
RPROVIDES:ncurses-static = "ncurses-static ( =  6.4-14.20240127.el10) ncurses-static(x86-64) ( =  6.4-14.20240127.el10)"

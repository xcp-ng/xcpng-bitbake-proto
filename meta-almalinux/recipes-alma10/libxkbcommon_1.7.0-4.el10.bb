
PN = "libxkbcommon"
PE = "0"
PV = "1.7.0"
PR = "4.el10"
PACKAGES = "libxkbcommon libxkbcommon-devel libxkbcommon-x11 libxkbcommon-x11-devel libxkbcommon-utils libxkbcommon-x11-utils"


URI_libxkbcommon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxkbcommon-1.7.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxkbcommon = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.5.8)(64bit) ( ) xkeyboard-config ( )"
RPROVIDES:libxkbcommon = "libxkbcommon.so.0()(64bit) ( ) libxkbcommon.so.0(V_0.5.0)(64bit) ( ) libxkbregistry.so.0()(64bit) ( ) libxkbregistry.so.0(V_1.0.0)(64bit) ( ) libxkbcommon.so.0(V_1.0.0)(64bit) ( ) libxkbcommon.so.0(V_0.6.0)(64bit) ( ) libxkbcommon.so.0(V_0.7.0)(64bit) ( ) libxkbcommon.so.0(V_0.8.0)(64bit) ( ) libxkbcommon.so.0(V_1.6.0)(64bit) ( ) libxkbcommon(x86-64) ( =  1.7.0-4.el10) libxkbcommon ( =  1.7.0-4.el10)"

URI_libxkbcommon-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxkbcommon-devel-1.7.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxkbcommon-devel = "/usr/bin/pkg-config ( ) libxkbcommon.so.0()(64bit) ( ) pkgconfig(libxml-2.0) ( ) libxkbregistry.so.0()(64bit) ( ) libxkbcommon(x86-64) ( =  1.7.0-4.el10)"
RPROVIDES:libxkbcommon-devel = "libxkbcommon-devel ( =  1.7.0-4.el10) libxkbcommon-devel(x86-64) ( =  1.7.0-4.el10) pkgconfig(xkbcommon) ( =  1.7.0) pkgconfig(xkbregistry) ( =  1.7.0)"

URI_libxkbcommon-x11 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxkbcommon-x11-1.7.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxkbcommon-x11 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libxcb.so.1()(64bit) ( ) libxkbcommon.so.0()(64bit) ( ) libxkbcommon.so.0(V_0.5.0)(64bit) ( ) libxcb-xkb.so.1()(64bit) ( ) libxkbcommon(x86-64) ( =  1.7.0-4.el10)"
RPROVIDES:libxkbcommon-x11 = "libxkbcommon-x11.so.0()(64bit) ( ) libxkbcommon-x11.so.0(V_0.5.0)(64bit) ( ) libxkbcommon-x11 ( =  1.7.0-4.el10) libxkbcommon-x11(x86-64) ( =  1.7.0-4.el10)"

URI_libxkbcommon-x11-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libxkbcommon-x11-devel-1.7.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxkbcommon-x11-devel = "/usr/bin/pkg-config ( ) pkgconfig(xkbcommon) ( ) libxkbcommon-x11.so.0()(64bit) ( ) libxkbcommon-x11(x86-64) ( =  1.7.0-4.el10) pkgconfig(xcb) ( >=  1.10) pkgconfig(xcb-xkb) ( >=  1.10)"
RPROVIDES:libxkbcommon-x11-devel = "libxkbcommon-x11-devel ( =  1.7.0-4.el10) libxkbcommon-x11-devel(x86-64) ( =  1.7.0-4.el10) pkgconfig(xkbcommon-x11) ( =  1.7.0)"

URI_libxkbcommon-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libxkbcommon-utils-1.7.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxkbcommon-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libwayland-client.so.0()(64bit) ( ) libxkbcommon.so.0()(64bit) ( ) libxkbcommon.so.0(V_0.5.0)(64bit) ( ) libxkbcommon.so.0(V_0.6.0)(64bit) ( ) libxkbcommon.so.0(V_0.7.0)(64bit) ( ) libxkbcommon.so.0(V_1.0.0)(64bit) ( ) libxkbcommon.so.0(V_1.6.0)(64bit) ( ) libxkbregistry.so.0()(64bit) ( ) libxkbregistry.so.0(V_1.0.0)(64bit) ( ) libxkbcommon(x86-64) ( =  1.7.0-4.el10)"
RPROVIDES:libxkbcommon-utils = "libxkbcommon-utils(x86-64) ( =  1.7.0-4.el10) libxkbcommon-utils ( =  1.7.0-4.el10)"

URI_libxkbcommon-x11-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libxkbcommon-x11-utils-1.7.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxkbcommon-x11-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libxcb.so.1()(64bit) ( ) libxcb-xkb.so.1()(64bit) ( ) libxkbcommon.so.0()(64bit) ( ) libxkbcommon.so.0(V_0.5.0)(64bit) ( ) libxkbcommon.so.0(V_0.6.0)(64bit) ( ) libxkbcommon.so.0(V_0.7.0)(64bit) ( ) libxkbcommon-x11.so.0()(64bit) ( ) libxkbcommon-x11.so.0(V_0.5.0)(64bit) ( ) libxkbcommon(x86-64) ( =  1.7.0-4.el10) libxkbcommon-utils(x86-64) ( =  1.7.0-4.el10) libxkbcommon-x11(x86-64) ( =  1.7.0-4.el10)"
RPROVIDES:libxkbcommon-x11-utils = "libxkbcommon-x11-utils ( =  1.7.0-4.el10) libxkbcommon-x11-utils(x86-64) ( =  1.7.0-4.el10)"

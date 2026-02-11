
PN = "at-spi2-core"
PE = "0"
PV = "2.52.0"
PR = "3.el10"
PACKAGES = "at-spi2-atk at-spi2-atk-devel at-spi2-core at-spi2-core-devel atk atk-devel"


URI_at-spi2-atk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/at-spi2-atk-2.52.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:at-spi2-atk = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) libatk-1.0.so.0()(64bit) ( ) libatspi.so.0()(64bit) ( ) at-spi2-core(x86-64) ( =  2.52.0-3.el10) atk(x86-64) ( =  2.52.0-3.el10)"
RPROVIDES:at-spi2-atk = "libatk-bridge-2.0.so.0()(64bit) ( ) libatk-bridge.so()(64bit) ( ) at-spi2-atk(x86-64) ( =  2.52.0-3.el10) at-spi2-atk ( =  2.52.0-3.el10)"

URI_at-spi2-atk-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/at-spi2-atk-devel-2.52.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:at-spi2-atk-devel = "/usr/bin/pkg-config ( ) libatk-bridge-2.0.so.0()(64bit) ( ) pkgconfig(atk) ( ) pkgconfig(atspi-2) ( ) pkgconfig(glib-2.0) ( >=  2.67.4) pkgconfig(gobject-2.0) ( >=  2.0.0) at-spi2-atk(x86-64) ( =  2.52.0-3.el10) pkgconfig(dbus-1) ( >=  1.5) pkgconfig(gmodule-2.0) ( >=  2.0.0)"
RPROVIDES:at-spi2-atk-devel = "at-spi2-atk-devel ( =  2.52.0-3.el10) at-spi2-atk-devel(x86-64) ( =  2.52.0-3.el10) pkgconfig(atk-bridge-2.0) ( =  2.52.0)"

URI_at-spi2-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/at-spi2-core-2.52.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:at-spi2-core = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libX11.so.6()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) libXi.so.6()(64bit) ( ) dbus ( ) libXtst.so.6()(64bit) ( ) /usr/bin/xprop ( )"
RPROVIDES:at-spi2-core = "libatspi.so.0()(64bit) ( ) at-spi2-core(x86-64) ( =  2.52.0-3.el10) at-spi2-core ( =  2.52.0-3.el10)"

URI_at-spi2-core-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/at-spi2-core-devel-2.52.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:at-spi2-core-devel = "/usr/bin/pkg-config ( ) pkgconfig(x11) ( ) libatspi.so.0()(64bit) ( ) pkgconfig(xi) ( ) pkgconfig(xtst) ( ) at-spi2-core(x86-64) ( =  2.52.0-3.el10) pkgconfig(glib-2.0) ( >=  2.67.4) pkgconfig(gobject-2.0) ( >=  2.0.0) pkgconfig(dbus-1) ( >=  1.5) pkgconfig(gio-2.0) ( >=  2.28.0)"
RPROVIDES:at-spi2-core-devel = "at-spi2-core-devel ( =  2.52.0-3.el10) at-spi2-core-devel(x86-64) ( =  2.52.0-3.el10) pkgconfig(atspi-2) ( =  2.52.0)"

URI_atk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/atk-2.52.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:atk = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) at-spi2-core(x86-64) ( =  2.52.0-3.el10)"
RPROVIDES:atk = "libatk-1.0.so.0()(64bit) ( ) atk(x86-64) ( =  2.52.0-3.el10) atk ( =  2.52.0-3.el10)"

URI_atk-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/atk-devel-2.52.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:atk-devel = "/usr/bin/pkg-config ( ) libatk-1.0.so.0()(64bit) ( ) atk(x86-64) ( =  2.52.0-3.el10) pkgconfig(glib-2.0) ( >=  2.67.4) pkgconfig(gobject-2.0) ( >=  2.0.0)"
RPROVIDES:atk-devel = "atk-devel ( =  2.52.0-3.el10) atk-devel(x86-64) ( =  2.52.0-3.el10) pkgconfig(atk) ( =  2.52.0)"

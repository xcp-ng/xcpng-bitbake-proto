
PN = "wireplumber"
PE = "0"
PV = "0.5.5"
PR = "2.el10"
PACKAGES = "wireplumber wireplumber-libs wireplumber-devel wireplumber-doc"


URI_wireplumber = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/wireplumber-0.5.5-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:wireplumber = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libpipewire-0.3.so.0()(64bit) ( ) libwireplumber-0.5.so.0()(64bit) ( ) wireplumber-libs(x86-64) ( =  0.5.5-2.el10)"
RPROVIDES:wireplumber = "pipewire-session-manager ( ) wireplumber(x86-64) ( =  0.5.5-2.el10) wireplumber ( =  0.5.5-2.el10)"

URI_wireplumber-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/wireplumber-libs-0.5.5-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:wireplumber-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libpipewire-0.3.so.0()(64bit) ( ) liblua-5.4.so()(64bit) ( )"
RPROVIDES:wireplumber-libs = "libwireplumber-0.5.so.0()(64bit) ( ) libwireplumber-module-dbus-connection.so()(64bit) ( ) libwireplumber-module-default-nodes-api.so()(64bit) ( ) libwireplumber-module-file-monitor-api.so()(64bit) ( ) libwireplumber-module-log-settings.so()(64bit) ( ) libwireplumber-module-logind.so()(64bit) ( ) libwireplumber-module-lua-scripting.so()(64bit) ( ) libwireplumber-module-mixer-api.so()(64bit) ( ) libwireplumber-module-portal-permissionstore.so()(64bit) ( ) libwireplumber-module-reserve-device.so()(64bit) ( ) libwireplumber-module-settings.so()(64bit) ( ) libwireplumber-module-si-audio-adapter.so()(64bit) ( ) libwireplumber-module-si-node.so()(64bit) ( ) libwireplumber-module-si-standard-link.so()(64bit) ( ) libwireplumber-module-standard-event-source.so()(64bit) ( ) wireplumber-libs(x86-64) ( =  0.5.5-2.el10) wireplumber-libs ( =  0.5.5-2.el10)"

URI_wireplumber-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/wireplumber-devel-0.5.5-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:wireplumber-devel = "/usr/bin/pkg-config ( ) libwireplumber-0.5.so.0()(64bit) ( ) wireplumber(x86-64) ( =  0.5.5-2.el10) pkgconfig(gio-2.0) ( >=  2.68) pkgconfig(gobject-2.0) ( >=  2.68) wireplumber-libs(x86-64) ( =  0.5.5-2.el10) pkgconfig(gmodule-2.0) ( >=  2.68) pkgconfig(libpipewire-0.3) ( >=  1.0.2)"
RPROVIDES:wireplumber-devel = "pkgconfig(wireplumber-0.5) ( =  0.5.5) wireplumber-devel ( =  0.5.5-2.el10) wireplumber-devel(x86-64) ( =  0.5.5-2.el10)"

URI_wireplumber-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/wireplumber-doc-0.5.5-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:wireplumber-doc = ""
RPROVIDES:wireplumber-doc = "wireplumber-doc ( =  0.5.5-2.el10) wireplumber-doc(x86-64) ( =  0.5.5-2.el10)"

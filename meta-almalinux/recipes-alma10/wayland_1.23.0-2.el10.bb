
PN = "wayland"
PE = "0"
PV = "1.23.0"
PR = "2.el10"
PACKAGES = "libwayland-client libwayland-cursor libwayland-egl libwayland-server wayland-devel wayland-doc"


URI_libwayland-client = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libwayland-client-1.23.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwayland-client = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libffi.so.8()(64bit) ( ) libffi.so.8(LIBFFI_BASE_8.0)(64bit) ( )"
RPROVIDES:libwayland-client = "libwayland-client.so.0()(64bit) ( ) libwayland-client(x86-64) ( =  1.23.0-2.el10) libwayland-client ( =  1.23.0-2.el10)"

URI_libwayland-cursor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libwayland-cursor-1.23.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwayland-cursor = "rtld(GNU_HASH) ( ) libwayland-client.so.0()(64bit) ( ) libc.so.6(GLIBC_2.28)(64bit) ( ) libwayland-client(x86-64) ( =  1.23.0-2.el10)"
RPROVIDES:libwayland-cursor = "libwayland-cursor.so.0()(64bit) ( ) libwayland-cursor(x86-64) ( =  1.23.0-2.el10) libwayland-cursor ( =  1.23.0-2.el10)"

URI_libwayland-egl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libwayland-egl-1.23.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwayland-egl = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.2.5)(64bit) ( )"
RPROVIDES:libwayland-egl = "libwayland-egl.so.1()(64bit) ( ) libwayland-egl(x86-64) ( =  1.23.0-2.el10) libwayland-egl ( =  1.23.0-2.el10)"

URI_libwayland-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libwayland-server-1.23.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwayland-server = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libffi.so.8()(64bit) ( ) libffi.so.8(LIBFFI_BASE_8.0)(64bit) ( )"
RPROVIDES:libwayland-server = "libwayland-server.so.0()(64bit) ( ) libwayland-server(x86-64) ( =  1.23.0-2.el10) libwayland-server ( =  1.23.0-2.el10)"

URI_wayland-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/wayland-devel-1.23.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:wayland-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/pkg-config ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libexpat.so.1()(64bit) ( ) libwayland-client.so.0()(64bit) ( ) libxml2.so.2(LIBXML2_2.5.8)(64bit) ( ) libwayland-server.so.0()(64bit) ( ) libwayland-cursor.so.0()(64bit) ( ) libwayland-egl.so.1()(64bit) ( ) pkgconfig(wayland-client) ( ) pkgconfig(libffi) ( ) libwayland-client(x86-64) ( =  1.23.0-2.el10) libwayland-cursor(x86-64) ( =  1.23.0-2.el10) libwayland-egl(x86-64) ( =  1.23.0-2.el10) libwayland-server(x86-64) ( =  1.23.0-2.el10)"
RPROVIDES:wayland-devel = "pkgconfig(wayland-client) ( =  1.23.0) pkgconfig(wayland-cursor) ( =  1.23.0) pkgconfig(wayland-egl) ( =  18.1.0) pkgconfig(wayland-egl-backend) ( =  3) pkgconfig(wayland-scanner) ( =  1.23.0) pkgconfig(wayland-server) ( =  1.23.0) wayland-devel ( =  1.23.0-2.el10) wayland-devel(x86-64) ( =  1.23.0-2.el10)"

URI_wayland-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/wayland-doc-1.23.0-2.el10.noarch.rpm;unpack=0"
RDEPENDS:wayland-doc = ""
RPROVIDES:wayland-doc = "wayland-doc ( =  1.23.0-2.el10)"

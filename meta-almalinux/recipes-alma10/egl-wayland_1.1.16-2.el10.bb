
PN = "egl-wayland"
PE = "0"
PV = "1.1.16"
PR = "2.el10"
PACKAGES = "egl-wayland egl-wayland-devel"


URI_egl-wayland = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/egl-wayland-1.1.16-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:egl-wayland = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libwayland-client.so.0()(64bit) ( ) libdrm.so.2()(64bit) ( ) libwayland-server.so.0()(64bit) ( ) libglvnd-egl(x86-64) ( )"
RPROVIDES:egl-wayland = "libnvidia-egl-wayland.so.1()(64bit) ( ) egl-wayland(x86-64) ( =  1.1.16-2.el10) egl-wayland ( =  1.1.16-2.el10)"

URI_egl-wayland-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/egl-wayland-devel-1.1.16-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:egl-wayland-devel = "/usr/bin/pkg-config ( ) libnvidia-egl-wayland.so.1()(64bit) ( ) egl-wayland(x86-64) ( =  1.1.16-2.el10) pkgconfig(eglexternalplatform) ( >=  1.1) pkgconfig(eglexternalplatform) ( <  2)"
RPROVIDES:egl-wayland-devel = "egl-wayland-devel ( =  1.1.16-2.el10) egl-wayland-devel(x86-64) ( =  1.1.16-2.el10) pkgconfig(wayland-eglstream) ( =  1.1.16) pkgconfig(wayland-eglstream-protocols) ( =  1.1.16)"

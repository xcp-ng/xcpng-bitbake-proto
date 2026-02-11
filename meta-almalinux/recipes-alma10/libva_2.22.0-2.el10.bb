
PN = "libva"
PE = "0"
PV = "2.22.0"
PR = "2.el10"
PACKAGES = "libva libva-devel"


URI_libva = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libva-2.22.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libva = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libX11.so.6()(64bit) ( ) libXext.so.6()(64bit) ( ) libxcb.so.1()(64bit) ( ) libXfixes.so.3()(64bit) ( ) libdrm.so.2()(64bit) ( ) libwayland-client.so.0()(64bit) ( ) libX11-xcb.so.1()(64bit) ( ) libGL.so.1()(64bit) ( ) libxcb-dri3.so.0()(64bit) ( ) mesa-filesystem(x86-64) ( )"
RPROVIDES:libva = "libva.so.2()(64bit) ( ) libva-drm.so.2()(64bit) ( ) libva.so.2(VA_API_0.33.0)(64bit) ( ) libva-glx.so.2()(64bit) ( ) libva-wayland.so.2()(64bit) ( ) libva-x11.so.2()(64bit) ( ) libva.so.2(VA_API_0.32.0)(64bit) ( ) libva(x86-64) ( =  2.22.0-2.el10) libva ( =  2.22.0-2.el10)"

URI_libva-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libva-devel-2.22.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libva-devel = "/usr/bin/pkg-config ( ) pkgconfig(wayland-client) ( ) libva.so.2()(64bit) ( ) libva-drm.so.2()(64bit) ( ) libva-glx.so.2()(64bit) ( ) libva-wayland.so.2()(64bit) ( ) libva-x11.so.2()(64bit) ( ) pkgconfig(libva) ( ) libva(x86-64) ( =  2.22.0-2.el10)"
RPROVIDES:libva-devel = "libva-devel ( =  2.22.0-2.el10) libva-devel(x86-64) ( =  2.22.0-2.el10) pkgconfig(libva) ( =  1.22.0) pkgconfig(libva-drm) ( =  1.22.0) pkgconfig(libva-glx) ( =  1.22.0) pkgconfig(libva-wayland) ( =  1.22.0) pkgconfig(libva-x11) ( =  1.22.0)"


PN = "mesa-demos"
PE = "0"
PV = "9.0.0"
PR = "8.el10"
PACKAGES = "egl-utils glx-utils mesa-demos"


URI_egl-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/egl-utils-9.0.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:egl-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libX11.so.6()(64bit) ( ) libEGL.so.1()(64bit) ( ) libGLESv2.so.2()(64bit) ( )"
RPROVIDES:egl-utils = "eglinfo ( ) es2_info ( ) egl-utils ( =  9.0.0-8.el10) egl-utils(x86-64) ( =  9.0.0-8.el10)"

URI_glx-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/glx-utils-9.0.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:glx-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libX11.so.6()(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libGL.so.1()(64bit) ( )"
RPROVIDES:glx-utils = "glxinfo ( ) glxinfo64 ( ) glx-utils ( =  9.0.0-8.el10) glx-utils(x86-64) ( =  9.0.0-8.el10)"

URI_mesa-demos = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-demos-9.0.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-demos = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libX11.so.6()(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libXext.so.6()(64bit) ( ) libxcb.so.1()(64bit) ( ) libdrm.so.2()(64bit) ( ) libwayland-client.so.0()(64bit) ( ) libxkbcommon.so.0()(64bit) ( ) libxkbcommon.so.0(V_0.5.0)(64bit) ( ) libgbm.so.1()(64bit) ( ) libGL.so.1()(64bit) ( ) libEGL.so.1()(64bit) ( ) libvulkan.so.1()(64bit) ( ) libGLESv2.so.2()(64bit) ( ) libOpenGL.so.0()(64bit) ( ) libwayland-egl.so.1()(64bit) ( ) libdecor-0.so.0()(64bit) ( ) libxkbcommon-x11.so.0()(64bit) ( ) libxkbcommon-x11.so.0(V_0.5.0)(64bit) ( ) libGLU.so.1()(64bit) ( ) libglut.so.3()(64bit) ( )"
RPROVIDES:mesa-demos = "mesa-demos ( =  9.0.0-8.el10) mesa-demos(x86-64) ( =  9.0.0-8.el10)"

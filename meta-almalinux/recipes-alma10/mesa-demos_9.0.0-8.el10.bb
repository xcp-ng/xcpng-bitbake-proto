
PN = "mesa-demos"
PE = "0"
PV = "9.0.0"
PR = "8.el10"
PACKAGES = "egl-utils glx-utils mesa-demos"


URI_egl-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/egl-utils-9.0.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:egl-utils = "
 glibc
 libglvnd-gles
 libX11
 libglvnd-egl
"

URI_glx-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/glx-utils-9.0.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:glx-utils = "
 glibc
 libglvnd-glx
 libX11
"

URI_mesa-demos = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-demos-9.0.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-demos = "
 libwayland-client
 libglvnd-egl
 libglvnd-glx
 libglvnd-gles
 libglvnd-opengl
 libwayland-egl
 libxkbcommon-x11
 freeglut
 libX11
 libxcb
 mesa-libGLU
 mesa-libgbm
 glibc
 libxkbcommon
 vulkan-loader
 libdecor
 libdrm
 libXext
"

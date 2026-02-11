
PN = "egl-wayland"
PE = "0"
PV = "1.1.16"
PR = "2.el10"
PACKAGES = "egl-wayland egl-wayland-devel"


URI_egl-wayland = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/egl-wayland-1.1.16-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:egl-wayland = "
 libglvnd-egl
 libwayland-client
 libwayland-server
 glibc
 libdrm
"

URI_egl-wayland-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/egl-wayland-devel-1.1.16-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:egl-wayland-devel = "
 egl-wayland
 eglexternalplatform-devel
 pkgconf-pkg-config
"

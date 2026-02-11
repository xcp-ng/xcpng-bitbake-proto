
inherit dnf-bridge

PN = "wayland-protocols"
PE = "0"
PV = "1.41"
PR = "1.el10"
PACKAGES = "wayland-protocols-devel"


URI_wayland-protocols-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/wayland-protocols-devel-1.41-1.el10.noarch.rpm;unpack=0"
RDEPENDS:wayland-protocols-devel = " \
 pkgconf-pkg-config \
"

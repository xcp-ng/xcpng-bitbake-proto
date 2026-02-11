
inherit dnf-bridge

PN = "xdg-desktop-portal"
PE = "0"
PV = "1.20.0"
PR = "1.el10_0"
PACKAGES = "xdg-desktop-portal xdg-desktop-portal-devel"


URI_xdg-desktop-portal = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xdg-desktop-portal-1.20.0-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:xdg-desktop-portal = " \
 systemd-libs \
 gstreamer1 \
 fuse3-libs \
 fuse3 \
 libgcc \
 json-glib \
 gstreamer1-plugins-base \
 gdk-pixbuf2 \
 libgudev \
 bash \
 glib2 \
 dbus \
 geoclue2 \
 glibc \
 pipewire-libs \
 libportal \
 libdex \
"

URI_xdg-desktop-portal-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xdg-desktop-portal-devel-1.20.0-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:xdg-desktop-portal-devel = " \
 xdg-desktop-portal \
 pkgconf-pkg-config \
"


inherit dnf-bridge

PN = "libwnck3"
PE = "0"
PV = "43.0"
PR = "10.el10"
PACKAGES = "libwnck3 libwnck3-devel"


URI_libwnck3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libwnck3-43.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwnck3 = " \
 atk \
 startup-notification \
 pango \
 gdk-pixbuf2 \
 libX11 \
 libXrender \
 libXres \
 cairo \
 glib2 \
 gtk3 \
 glibc \
"

URI_libwnck3-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libwnck3-devel-43.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwnck3-devel = " \
 glib2-devel \
 startup-notification-devel \
 pkgconf-pkg-config \
 pango-devel \
 libX11 \
 libXres-devel \
 libX11-devel \
 libwnck3 \
 glib2 \
 cairo-devel \
 gtk3-devel \
 glibc \
 gtk3 \
"

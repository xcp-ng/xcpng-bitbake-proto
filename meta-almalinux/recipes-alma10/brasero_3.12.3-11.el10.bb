
inherit dnf-bridge

PN = "brasero"
PE = "0"
PV = "3.12.3"
PR = "11.el10"
PACKAGES = "brasero brasero-libs brasero-devel"


URI_brasero = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/brasero-3.12.3-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brasero = " \
 libburn \
 gstreamer1 \
 libtracker-sparql \
 libxml2 \
 pango \
 gdk-pixbuf2 \
 gstreamer1-plugins-base \
 libisofs \
 cairo \
 glib2 \
 gtk3 \
 glibc \
 brasero-libs \
"

URI_brasero-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/brasero-libs-3.12.3-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brasero-libs = " \
 gstreamer1 \
 gstreamer1-plugins-base \
 pango \
 gdk-pixbuf2 \
 libcanberra-gtk3 \
 cairo \
 glib2 \
 gtk3 \
 glibc \
 libnotify \
"

URI_brasero-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/brasero-devel-3.12.3-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brasero-devel = " \
 brasero-libs \
 glib2-devel \
 pkgconf-pkg-config \
 gtk3-devel \
"

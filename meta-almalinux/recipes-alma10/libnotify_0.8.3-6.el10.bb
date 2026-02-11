
PN = "libnotify"
PE = "0"
PV = "0.8.3"
PR = "6.el10"
PACKAGES = "libnotify libnotify-devel"


URI_libnotify = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnotify-0.8.3-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnotify = " \
 glibc \
 glib2 \
 gdk-pixbuf2 \
"

URI_libnotify-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnotify-devel-0.8.3-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnotify-devel = " \
 gdk-pixbuf2-devel \
 glib2-devel \
 pkgconf-pkg-config \
 libnotify \
"

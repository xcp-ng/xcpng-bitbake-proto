
PN = "dconf"
PE = "0"
PV = "0.40.0"
PR = "16.el10"
PACKAGES = "dconf dconf-devel"


URI_dconf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dconf-0.40.0-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dconf = " \
 libgcc \
 bash \
 glib2 \
 dbus \
 glibc \
"

URI_dconf-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/dconf-devel-0.40.0-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dconf-devel = " \
 glib2-devel \
 pkgconf-pkg-config \
 dconf \
"

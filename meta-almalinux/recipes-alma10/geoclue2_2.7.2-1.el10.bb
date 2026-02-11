
PN = "geoclue2"
PE = "0"
PV = "2.7.2"
PR = "1.el10"
PACKAGES = "geoclue2 geoclue2-libs geoclue2-demos geoclue2-devel"


URI_geoclue2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/geoclue2-2.7.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:geoclue2 = " \
 shadow-utils \
 libsoup3 \
 ModemManager-glib \
 libgcc \
 json-glib \
 avahi-glib \
 avahi-libs \
 bash \
 glib2 \
 dbus \
 glibc \
 libnotify \
"

URI_geoclue2-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/geoclue2-libs-2.7.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:geoclue2-libs = " \
 glibc \
 libgcc \
 glib2 \
"

URI_geoclue2-demos = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/geoclue2-demos-2.7.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:geoclue2-demos = " \
 glibc \
 libgcc \
 glib2 \
 geoclue2-libs \
"

URI_geoclue2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/geoclue2-devel-2.7.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:geoclue2-devel = " \
 glib2-devel \
 pkgconf-pkg-config \
 geoclue2-libs \
"

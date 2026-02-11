
inherit dnf-bridge

PN = "geocode-glib"
PE = "0"
PV = "3.26.4"
PR = "14.el10"
PACKAGES = "geocode-glib geocode-glib-devel"


URI_geocode-glib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/geocode-glib-3.26.4-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:geocode-glib = " \
 libsoup3 \
 libgcc \
 json-glib \
 glib2 \
 glibc \
"

URI_geocode-glib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/geocode-glib-devel-3.26.4-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:geocode-glib-devel = " \
 geocode-glib \
 glib2-devel \
 pkgconf-pkg-config \
"

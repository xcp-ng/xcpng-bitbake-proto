
inherit dnf-bridge

PN = "tracker"
PE = "0"
PV = "3.7.3"
PR = "4.el10"
PACKAGES = "libtracker-sparql tracker tracker-devel tracker-doc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/tracker-3.7.3-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libtracker-sparql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtracker-sparql-3.7.3-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libtracker-sparql}"
RDEPENDS:libtracker-sparql = " \
 libsoup3 \
 libxml2 \
 json-glib \
 avahi-glib \
 sqlite-libs \
 avahi-libs \
 bash \
 glib2 \
 glibc \
 libicu \
"

URI_tracker = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tracker-3.7.3-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_tracker}"
RDEPENDS:tracker = " \
 libtracker-sparql \
 libgcc \
 json-glib \
 avahi-glib \
 sqlite-libs \
 avahi-libs \
 bash \
 glib2 \
 glibc \
"

URI_tracker-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/tracker-devel-3.7.3-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_tracker-devel}"
RDEPENDS:tracker-devel = " \
 json-glib-devel \
 libxml2-devel \
 glib2-devel \
 libtracker-sparql \
 pkgconf-pkg-config \
 bash \
 sqlite-devel \
"

URI_tracker-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/tracker-doc-3.7.3-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tracker-doc}"
RDEPENDS:tracker-doc = ""

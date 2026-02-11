
inherit dnf-bridge

PN = "libgweather"
PE = "1"
PV = "4.4.4"
PR = "3.el10"
PACKAGES = "libgweather libgweather-devel libgweather-doc"


URI_libgweather = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgweather-4.4.4-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgweather = " \
 libsoup3 \
 libgcc \
 libxml2 \
 json-glib \
 glib2 \
 glibc \
 geocode-glib \
"

URI_libgweather-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgweather-devel-4.4.4-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgweather-devel = " \
 json-glib-devel \
 libxml2-devel \
 glib2-devel \
 libsoup3-devel \
 pkgconf-pkg-config \
 geocode-glib-devel \
 libgweather \
"

URI_libgweather-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgweather-doc-4.4.4-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgweather-doc = ""


inherit dnf-bridge

PN = "json-glib"
PE = "0"
PV = "1.8.0"
PR = "5.el10"
PACKAGES = "json-glib json-glib-devel json-glib-tests"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/json-glib-1.8.0-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_json-glib = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/json-glib-1.8.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_json-glib}"
RDEPENDS:json-glib = " \
 glibc \
 glib2 \
"

URI_json-glib-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/json-glib-devel-1.8.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_json-glib-devel}"
RDEPENDS:json-glib-devel = " \
 glib2-devel \
 pkgconf-pkg-config \
 json-glib \
 glib2 \
 glibc \
"

URI_json-glib-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/json-glib-tests-1.8.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_json-glib-tests}"
RDEPENDS:json-glib-tests = " \
 glibc \
 glib2 \
 json-glib \
"

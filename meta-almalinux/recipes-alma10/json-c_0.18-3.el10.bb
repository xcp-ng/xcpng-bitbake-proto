
inherit dnf-bridge

PN = "json-c"
PE = "0"
PV = "0.18"
PR = "3.el10"
PACKAGES = "json-c json-c-devel json-c-doc"


URI_json-c = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/json-c-0.18-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:json-c = " \
 glibc \
"

URI_json-c-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/json-c-devel-0.18-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:json-c-devel = " \
 json-c \
 cmake-filesystem \
 pkgconf-pkg-config \
"

URI_json-c-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/json-c-doc-0.18-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:json-c-doc = " \
 json-c \
"


PN = "liblognorm"
PE = "0"
PV = "2.0.6"
PR = "15.el10"
PACKAGES = "liblognorm liblognorm-doc liblognorm-devel liblognorm-utils"


URI_liblognorm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liblognorm-2.0.6-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblognorm = " \
 glibc \
 libfastjson \
 libestr \
 pcre2 \
"

URI_liblognorm-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liblognorm-doc-2.0.6-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblognorm-doc = ""

URI_liblognorm-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/liblognorm-devel-2.0.6-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblognorm-devel = " \
 json-c-devel \
 liblognorm \
 pkgconf-pkg-config \
 libestr-devel \
 libfastjson-devel \
"

URI_liblognorm-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/liblognorm-utils-2.0.6-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblognorm-utils = " \
 glibc \
 libfastjson \
 libestr \
 liblognorm \
"

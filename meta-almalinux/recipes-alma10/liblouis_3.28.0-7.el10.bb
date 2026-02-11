
PN = "liblouis"
PE = "0"
PV = "3.28.0"
PR = "7.el10"
PACKAGES = "liblouis liblouis-tables python3-louis liblouis-devel liblouis-doc liblouis-utils"


URI_liblouis = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liblouis-3.28.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblouis = " \
 glibc \
 liblouis-tables \
"

URI_liblouis-tables = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liblouis-tables-3.28.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:liblouis-tables = ""

URI_python3-louis = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-louis-3.28.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-louis = " \
 python3 \
 liblouis \
"

URI_liblouis-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/liblouis-devel-3.28.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblouis-devel = " \
 pkgconf-pkg-config \
 liblouis \
"

URI_liblouis-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/liblouis-doc-3.28.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:liblouis-doc = " \
 liblouis \
"

URI_liblouis-utils = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/liblouis-utils-3.28.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblouis-utils = " \
 glibc \
 libyaml \
 liblouis \
"


inherit dnf-bridge

PN = "ding-libs"
PE = "0"
PV = "0.6.2"
PR = "58.el10"
PACKAGES = "libbasicobjects libcollection libdhash libini_config libpath_utils libref_array libbasicobjects-devel libcollection-devel libdhash-devel libini_config-devel libpath_utils-devel libref_array-devel"


URI_libbasicobjects = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libbasicobjects-0.1.1-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libbasicobjects = " \
 glibc \
"

URI_libcollection = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libcollection-0.7.0-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcollection = " \
 glibc \
"

URI_libdhash = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libdhash-0.5.0-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdhash = " \
 glibc \
"

URI_libini_config = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libini_config-1.3.1-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libini_config = " \
 libbasicobjects \
 libref_array \
 libcollection \
 glibc \
 libpath_utils \
"

URI_libpath_utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libpath_utils-0.2.1-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpath_utils = " \
 glibc \
"

URI_libref_array = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libref_array-0.1.5-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libref_array = " \
 glibc \
"

URI_libbasicobjects-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libbasicobjects-devel-0.1.1-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libbasicobjects-devel = " \
 libbasicobjects \
 pkgconf-pkg-config \
"

URI_libcollection-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libcollection-devel-0.7.0-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcollection-devel = " \
 libcollection \
 pkgconf-pkg-config \
"

URI_libdhash-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libdhash-devel-0.5.0-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdhash-devel = " \
 libdhash \
 pkgconf-pkg-config \
"

URI_libini_config-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libini_config-devel-1.3.1-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libini_config-devel = " \
 libcollection-devel \
 pkgconf-pkg-config \
 libref_array-devel \
 libini_config \
 libbasicobjects-devel \
"

URI_libpath_utils-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libpath_utils-devel-0.2.1-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpath_utils-devel = " \
 pkgconf-pkg-config \
 libpath_utils \
"

URI_libref_array-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libref_array-devel-0.1.5-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libref_array-devel = " \
 libref_array \
 pkgconf-pkg-config \
"

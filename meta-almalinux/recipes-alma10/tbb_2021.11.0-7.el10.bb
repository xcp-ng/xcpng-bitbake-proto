
PN = "tbb"
PE = "0"
PV = "2021.11.0"
PR = "7.el10"
PACKAGES = "python3-tbb tbb tbb-bind tbb-devel tbb-doc"


URI_python3-tbb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-tbb-2021.11.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-tbb = " \
 python3 \
 libgcc \
 libstdc++ \
 glibc \
 tbb \
"

URI_tbb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tbb-2021.11.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tbb = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_tbb-bind = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tbb-bind-2021.11.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tbb-bind = " \
 libgcc \
 hwloc-libs \
 libstdc++ \
 glibc \
 tbb \
"

URI_tbb-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tbb-devel-2021.11.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tbb-devel = " \
 tbb \
 cmake-filesystem \
 pkgconf-pkg-config \
 tbb-bind \
"

URI_tbb-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tbb-doc-2021.11.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tbb-doc = ""

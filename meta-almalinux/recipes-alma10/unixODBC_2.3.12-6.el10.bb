
PN = "unixODBC"
PE = "0"
PV = "2.3.12"
PR = "6.el10"
PACKAGES = "unixODBC unixODBC-devel"


URI_unixODBC = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/unixODBC-2.3.12-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:unixODBC = " \
 glibc \
 readline \
 libtool-ltdl \
"

URI_unixODBC-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/unixODBC-devel-2.3.12-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:unixODBC-devel = " \
 unixODBC-devel \
 unixODBC \
 pkgconf-pkg-config \
"

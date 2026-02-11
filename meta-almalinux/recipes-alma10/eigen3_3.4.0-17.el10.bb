
PN = "eigen3"
PE = "0"
PV = "3.4.0"
PR = "17.el10"
PACKAGES = "eigen3-devel eigen3-doc"


URI_eigen3-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/eigen3-devel-3.4.0-17.el10.noarch.rpm;unpack=0"
RDEPENDS:eigen3-devel = " \
 cmake-filesystem \
 pkgconf-pkg-config \
"

URI_eigen3-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/eigen3-doc-3.4.0-17.el10.noarch.rpm;unpack=0"
RDEPENDS:eigen3-doc = " \
 eigen3-devel \
"

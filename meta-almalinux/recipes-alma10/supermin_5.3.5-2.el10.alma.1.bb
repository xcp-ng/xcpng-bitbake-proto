
PN = "supermin"
PE = "0"
PV = "5.3.5"
PR = "2.el10.alma.1"
PACKAGES = "supermin supermin-devel"


URI_supermin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/supermin-5.3.5-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:supermin = "
 e2fsprogs
 e2fsprogs-libs
 util-linux
 tar
 libcom_err
 glibc
 rpm
 cpio
 rpm-libs
"

URI_supermin-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/supermin-devel-5.3.5-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:supermin-devel = "
 dnf
 rpm-build
 dnf-plugins-core
 bash
 supermin
 findutils
"

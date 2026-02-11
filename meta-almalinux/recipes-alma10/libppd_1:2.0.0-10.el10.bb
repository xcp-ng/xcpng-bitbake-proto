
PN = "libppd"
PE = "1"
PV = "2.0.0"
PR = "10.el10"
PACKAGES = "libppd libppd-devel"


URI_libppd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libppd-2.0.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libppd = " \
 libgcc \
 cups-libs \
 cups \
 libstdc++ \
 poppler-utils \
 libcupsfilters \
 glibc \
 ghostscript \
"

URI_libppd-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libppd-devel-2.0.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libppd-devel = " \
 cups-devel \
 libppd \
 pkgconf-pkg-config \
 libcupsfilters-devel \
"

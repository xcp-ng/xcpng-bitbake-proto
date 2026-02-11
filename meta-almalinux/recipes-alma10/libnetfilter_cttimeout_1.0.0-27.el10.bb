
PN = "libnetfilter_cttimeout"
PE = "0"
PV = "1.0.0"
PR = "27.el10"
PACKAGES = "libnetfilter_cttimeout libnetfilter_cttimeout-devel"


URI_libnetfilter_cttimeout = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnetfilter_cttimeout-1.0.0-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnetfilter_cttimeout = "
 glibc
 libmnl
"

URI_libnetfilter_cttimeout-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libnetfilter_cttimeout-devel-1.0.0-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnetfilter_cttimeout-devel = "
 libnetfilter_cttimeout
 kernel-headers
 pkgconf-pkg-config
 libmnl-devel
"

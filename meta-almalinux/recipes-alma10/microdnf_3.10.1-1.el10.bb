
PN = "microdnf"
PE = "0"
PV = "3.10.1"
PR = "1.el10"
PACKAGES = "microdnf"


URI_microdnf = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/microdnf-3.10.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:microdnf = "
 libpeas1
 libgcc
 dnf-data
 glib2
 glibc
 libdnf
 rpm-libs
 libsmartcols
"

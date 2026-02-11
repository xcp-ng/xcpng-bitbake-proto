
PN = "msitools"
PE = "0"
PV = "0.103"
PR = "5.el10"
PACKAGES = "libmsi1 libmsi1-devel msitools"


URI_libmsi1 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libmsi1-0.103-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmsi1 = " \
 glibc \
 libgcc \
 libgsf \
 glib2 \
"

URI_libmsi1-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libmsi1-devel-0.103-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmsi1-devel = " \
 glib2-devel \
 pkgconf-pkg-config \
 libmsi1 \
"

URI_msitools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/msitools-0.103-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:msitools = " \
 libmsi1 \
 libgcab1 \
 libgcc \
 libxml2 \
 bash \
 glib2 \
 libgsf \
 glibc \
"

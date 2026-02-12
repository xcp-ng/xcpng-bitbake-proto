
inherit dnf-bridge

PN = "gcr"
PE = "0"
PV = "4.3.0"
PR = "1.el10"
PACKAGES = "gcr gcr-devel gcr-libs"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/gcr-4.3.0-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gcr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gcr-4.3.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gcr}"
RDEPENDS:gcr = " \
 gnupg2 \
 systemd-libs \
 openssh-clients \
 pango \
 libsecret \
 bash \
 glib2 \
 glibc \
 gtk4 \
 gcr-libs \
"

URI_gcr-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gcr-devel-4.3.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gcr-devel}"
RDEPENDS:gcr-devel = " \
 p11-kit-devel \
 glib2-devel \
 pkgconf-pkg-config \
 gcr-devel \
 gcr-libs \
"

URI_gcr-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gcr-libs-4.3.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gcr-libs}"
RDEPENDS:gcr-libs = " \
 glibc \
 gnutls \
 glib2 \
 p11-kit \
"

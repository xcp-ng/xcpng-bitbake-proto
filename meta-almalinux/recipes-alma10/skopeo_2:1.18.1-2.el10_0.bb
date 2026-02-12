
inherit dnf-bridge

PN = "skopeo"
PE = "2"
PV = "1.18.1"
PR = "2.el10_0"
PACKAGES = "skopeo skopeo-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/skopeo-1.18.1-2.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_skopeo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/skopeo-1.18.1-2.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_skopeo}"
RDEPENDS:skopeo = " \
 glibc \
 containers-common \
 gpgme \
 shadow-utils-subid \
"

URI_skopeo-tests = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/skopeo-tests-1.18.1-2.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_skopeo-tests}"
RDEPENDS:skopeo-tests = " \
 gnupg2 \
 openssl \
 jq \
 httpd-tools \
 skopeo \
 crun \
 bash \
 coreutils \
 golang \
 podman \
"


inherit dnf-bridge

PN = "buildah"
PE = "2"
PV = "1.39.4"
PR = "2.el10_0"
PACKAGES = "buildah buildah-tests"


URI_buildah = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/buildah-1.39.4-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:buildah = " \
 containers-common-extra \
 shadow-utils-subid \
 gpgme \
 libseccomp \
 glibc \
"

URI_buildah-tests = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/buildah-tests-1.39.4-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:buildah-tests = " \
 nmap-ncat \
 bzip2 \
 shadow-utils-subid \
 openssl \
 buildah \
 gpgme \
 jq \
 httpd-tools \
 git-daemon \
 bash \
 libseccomp \
 glibc \
 golang \
 podman \
"

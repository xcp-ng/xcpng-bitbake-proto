
inherit dnf-bridge

PN = "podman"
PE = "6"
PV = "5.4.0"
PR = "13.el10_0"
PACKAGES = "podman podman-docker podman-remote podman-tests podman-machine podmansh"


URI_podman = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/podman-5.4.0-13.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:podman = " \
 containers-common-extra \
 shadow-utils-subid \
 gpgme \
 libgcc \
 libseccomp \
 glibc \
 conmon \
 catatonit \
"

URI_podman-docker = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/podman-docker-5.4.0-13.el10_0.noarch.rpm;unpack=0"
RDEPENDS:podman-docker = " \
 bash \
 podman \
"

URI_podman-remote = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/podman-remote-5.4.0-13.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:podman-remote = " \
 glibc \
 gpgme \
 libgcc \
 shadow-utils-subid \
"

URI_podman-tests = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/podman-tests-5.4.0-13.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:podman-tests = " \
 gnupg2 \
 shadow-utils-subid \
 nmap-ncat \
 attr \
 openssl \
 buildah \
 libgcc \
 jq \
 gpgme \
 httpd-tools \
 skopeo \
 bash \
 libseccomp \
 glibc \
 podman \
 socat \
"

URI_podman-machine = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/podman-machine-5.4.0-13.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:podman-machine = " \
 qemu-img \
 gvisor-tap-vsock \
 qemu-kvm \
 virtiofsd \
 podman \
"

URI_podmansh = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/podmansh-5.4.0-13.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:podmansh = " \
 podman \
"

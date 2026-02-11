
inherit dnf-bridge

PN = "virt-v2v"
PE = "1"
PV = "2.7.1"
PR = "4.el10"
PACKAGES = "virt-v2v virt-v2v-bash-completion virt-v2v-man-pages-ja virt-v2v-man-pages-uk"


URI_virt-v2v = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/virt-v2v-2.7.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:virt-v2v = " \
 curl \
 libnbd \
 edk2-ovmf \
 libvirt-client \
 unzip \
 nbdkit-basic-filters \
 nbdkit-basic-plugins \
 libosinfo \
 nbdkit-curl-plugin \
 qemu-img \
 json-c \
 nbdkit-nbd-plugin \
 nbdkit-server \
 nbdkit-ssh-plugin \
 libvirt-libs \
 nbdkit-vddk-plugin \
 openssh-clients \
 libxcrypt \
 libgcc \
 libxml2 \
 pcre2 \
 libguestfs \
 libguestfs-winsupport \
 libguestfs-xfs \
 mingw-srvany-redistributable \
 gzip \
 gawk \
 glib2 \
 glibc \
 guestfs-tools \
"

URI_virt-v2v-bash-completion = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/virt-v2v-bash-completion-2.7.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:virt-v2v-bash-completion = " \
 virt-v2v \
 bash-completion \
"

URI_virt-v2v-man-pages-ja = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/virt-v2v-man-pages-ja-2.7.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:virt-v2v-man-pages-ja = " \
 virt-v2v \
"

URI_virt-v2v-man-pages-uk = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/virt-v2v-man-pages-uk-2.7.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:virt-v2v-man-pages-uk = " \
 virt-v2v \
"

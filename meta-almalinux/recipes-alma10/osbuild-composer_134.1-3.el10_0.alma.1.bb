
PN = "osbuild-composer"
PE = "0"
PV = "134.1"
PR = "3.el10_0.alma.1"
PACKAGES = "osbuild-composer osbuild-composer-core osbuild-composer-worker osbuild-composer-tests"


URI_osbuild-composer = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/osbuild-composer-134.1-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:osbuild-composer = " \
 osbuild-composer-core \
 systemd \
 bash \
 osbuild-composer-worker \
"

URI_osbuild-composer-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/osbuild-composer-core-134.1-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:osbuild-composer-core = " \
 glibc \
 libxcrypt \
 gpgme \
 osbuild-depsolve-dnf \
"

URI_osbuild-composer-worker = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/osbuild-composer-worker-134.1-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:osbuild-composer-worker = " \
 systemd \
 osbuild \
 libxcrypt \
 gpgme \
 qemu-img \
 osbuild-depsolve-dnf \
 krb5-libs \
 osbuild-luks2 \
 libcom_err \
 bash \
 osbuild-lvm2 \
 osbuild-ostree \
 glibc \
"

URI_osbuild-composer-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/osbuild-composer-tests-134.1-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:osbuild-composer-tests = " \
 python3 \
 container-selinux \
 systemd-container \
 dnsmasq \
 createrepo_c \
 krb5-libs \
 krb5-workstation \
 libvirt-client \
 libvirt-daemon \
 libvirt-daemon-config-network \
 httpd \
 unzip \
 libvirt-daemon-driver-network \
 libvirt-daemon-driver-nodedev \
 libvirt-daemon-config-nwfilter \
 libvirt-daemon-driver-qemu \
 libvirt-daemon-driver-interface \
 qemu-img \
 jq \
 libvirt-daemon-driver-storage-disk \
 qemu-kvm \
 libvirt-daemon-driver-nwfilter \
 libvirt-daemon-driver-secret \
 libvirt-daemon-driver-storage \
 dnf-plugins-core \
 expect \
 libcom_err \
 python3-lxml \
 libvirt-daemon-kvm \
 skopeo \
 xorriso \
 qemu-kvm-core \
 virt-install \
 libxcrypt \
 openssl \
 gpgme \
 bash \
 rpmdevtools \
 python3-pip \
 firewalld \
 sssd-krb5 \
 weldr-client \
 osbuild-composer \
 make \
 glibc \
 mod_ssl \
 podman \
"

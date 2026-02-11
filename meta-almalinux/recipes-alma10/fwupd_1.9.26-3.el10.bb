
PN = "fwupd"
PE = "0"
PV = "1.9.26"
PR = "3.el10"
PACKAGES = "fwupd fwupd-plugin-flashrom fwupd-devel fwupd-plugin-uefi-capsule-data fwupd-tests"


URI_fwupd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/fwupd-1.9.26-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fwupd = " \
 systemd \
 systemd-libs \
 tpm2-tss \
 libarchive \
 json-glib \
 libcurl \
 xz-libs \
 zlib-ng-compat \
 gnutls \
 shared-mime-info \
 libgcc \
 libxmlb \
 libgudev \
 sqlite-libs \
 libgusb \
 bash \
 libjcat \
 polkit-libs \
 glib2 \
 glibc \
"

URI_fwupd-plugin-flashrom = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fwupd-plugin-flashrom-1.9.26-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fwupd-plugin-flashrom = " \
 fwupd \
 libgcc \
 glib2 \
 glibc \
 flashrom \
"

URI_fwupd-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/fwupd-devel-1.9.26-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fwupd-devel = " \
 json-glib-devel \
 glib2-devel \
 libjcat-devel \
 fwupd \
 pkgconf-pkg-config \
 libcurl-devel \
"

URI_fwupd-plugin-uefi-capsule-data = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/fwupd-plugin-uefi-capsule-data-1.9.26-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fwupd-plugin-uefi-capsule-data = " \
 fwupd \
"

URI_fwupd-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/fwupd-tests-1.9.26-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fwupd-tests = " \
 gnutls \
 fwupd \
 libgcc \
 json-glib \
 libxmlb \
 libgudev \
 libgusb \
 bash \
 glib2 \
 libcurl \
 glibc \
"

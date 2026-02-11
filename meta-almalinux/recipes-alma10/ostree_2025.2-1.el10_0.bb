
PN = "ostree"
PE = "0"
PV = "2025.2"
PR = "1.el10_0"
PACKAGES = "ostree ostree-grub2 ostree-libs ostree-devel"


URI_ostree = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ostree-2025.2-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ostree = "
 ostree-libs
 systemd
 gnupg2
 systemd-libs
 libarchive
 fuse-libs
 openssl-libs
 libgcc
 composefs
 composefs-libs
 bash
 glib2
 dracut
 glibc
 libselinux
"

URI_ostree-grub2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ostree-grub2-2025.2-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ostree-grub2 = "
 ostree
 bash
 grub2-pc
"

URI_ostree-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ostree-libs-2025.2-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ostree-libs = "
 zlib-ng-compat
 systemd-libs
 libarchive
 openssl-libs
 libgcc
 gpgme
 libmount
 libgpg-error
 composefs-libs
 glib2
 libcurl
 glibc
 libselinux
 xz-libs
"

URI_ostree-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ostree-devel-2025.2-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ostree-devel = "
 ostree-libs
 gpgme-devel
 libarchive-devel
 glib2-devel
 xz-devel
 systemd-devel
 zlib-ng-compat-devel
 composefs-devel
 libgpg-error-devel
 pkgconf-pkg-config
 openssl-devel
 libselinux-devel
 libcurl-devel
"


PN = "libblockdev"
PE = "0"
PV = "3.2.0"
PR = "4.el10_0"
PACKAGES = "libblockdev libblockdev-crypto libblockdev-dm libblockdev-fs libblockdev-loop libblockdev-lvm libblockdev-lvm-dbus libblockdev-mdraid libblockdev-mpath libblockdev-nvdimm libblockdev-nvme libblockdev-part libblockdev-plugins-all libblockdev-smart libblockdev-smartmontools libblockdev-swap libblockdev-tools libblockdev-utils python3-blockdev libblockdev-crypto-devel libblockdev-devel libblockdev-dm-devel libblockdev-fs-devel libblockdev-loop-devel libblockdev-lvm-dbus-devel libblockdev-lvm-devel libblockdev-mdraid-devel libblockdev-mpath-devel libblockdev-nvdimm-devel libblockdev-nvme-devel libblockdev-part-devel libblockdev-smart-devel libblockdev-smartmontools-devel libblockdev-swap-devel libblockdev-utils-devel"


URI_libblockdev = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libudev.so.1()(64bit) ( ) libbd_utils.so.3()(64bit) ( ) libkmod.so.2()(64bit) ( ) libblockdev-utils(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev = "libblockdev.so.3()(64bit) ( ) libblockdev(x86-64) ( =  3.2.0-4.el10_0) libblockdev ( =  3.2.0-4.el10_0) config(libblockdev) ( =  3.2.0-4.el10_0) libblockdev-kbd ( =  3.2.0-4.el10_0) libblockdev-vdo ( =  3.2.0-4.el10_0)"

URI_libblockdev-crypto = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-crypto-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-crypto = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libudev.so.1()(64bit) ( ) libnspr4.so()(64bit) ( ) libnss3.so()(64bit) ( ) libplc4.so()(64bit) ( ) libnss3.so(NSS_3.2)(64bit) ( ) libnssutil3.so()(64bit) ( ) libplds4.so()(64bit) ( ) libsmime3.so()(64bit) ( ) libbd_utils.so.3()(64bit) ( ) libssl3.so()(64bit) ( ) libkmod.so.2()(64bit) ( ) libnss3.so(NSS_3.9.2)(64bit) ( ) libsmime3.so(NSS_3.4)(64bit) ( ) libblkid.so.1()(64bit) ( ) libblkid.so.1(BLKID_2.17)(64bit) ( ) libblkid.so.1(BLKID_2.15)(64bit) ( ) libcryptsetup.so.12()(64bit) ( ) libc.so.6(GLIBC_2.6)(64bit) ( ) libkeyutils.so.1()(64bit) ( ) libcryptsetup.so.12(CRYPTSETUP_2.0)(64bit) ( ) libkeyutils.so.1(KEYUTILS_0.3)(64bit) ( ) libvolume_key.so.1()(64bit) ( ) libcryptsetup.so.12(CRYPTSETUP_2.4)(64bit) ( ) libcryptsetup.so.12(CRYPTSETUP_2.7)(64bit) ( ) libblockdev-utils(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-crypto = "libbd_crypto.so.3()(64bit) ( ) libblockdev-crypto(x86-64) ( =  3.2.0-4.el10_0) libblockdev-crypto ( =  3.2.0-4.el10_0)"

URI_libblockdev-dm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-dm-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-dm = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libudev.so.1()(64bit) ( ) libbd_utils.so.3()(64bit) ( ) libkmod.so.2()(64bit) ( ) libdevmapper.so.1.02()(64bit) ( ) libdevmapper.so.1.02(Base)(64bit) ( ) libdevmapper.so.1.02(DM_1_02_197)(64bit) ( ) libdevmapper.so.1.02(DM_1_02_97)(64bit) ( ) device-mapper ( ) libblockdev-utils(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-dm = "libbd_dm.so.3()(64bit) ( ) libblockdev-dm(x86-64) ( =  3.2.0-4.el10_0) libblockdev-dm ( =  3.2.0-4.el10_0)"

URI_libblockdev-fs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-fs-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-fs = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libudev.so.1()(64bit) ( ) libbd_utils.so.3()(64bit) ( ) libkmod.so.2()(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libblkid.so.1()(64bit) ( ) libc.so.6(GLIBC_2.7)(64bit) ( ) libmount.so.1()(64bit) ( ) libblkid.so.1(BLKID_2.17)(64bit) ( ) libblkid.so.1(BLKID_2.15)(64bit) ( ) libmount.so.1(MOUNT_2.19)(64bit) ( ) libe2p.so.2()(64bit) ( ) libext2fs.so.2()(64bit) ( ) libmount.so.1(MOUNT_2.22)(64bit) ( ) libmount.so.1(MOUNT_2.21)(64bit) ( ) libblkid.so.1(BLKID_2.21)(64bit) ( ) libmount.so.1(MOUNT_2.30)(64bit) ( ) libblockdev-utils(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-fs = "libbd_fs.so.3()(64bit) ( ) libblockdev-fs(x86-64) ( =  3.2.0-4.el10_0) libblockdev-fs ( =  3.2.0-4.el10_0)"

URI_libblockdev-loop = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-loop-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-loop = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libudev.so.1()(64bit) ( ) libbd_utils.so.3()(64bit) ( ) libkmod.so.2()(64bit) ( ) libc.so.6(GLIBC_2.27)(64bit) ( ) libblockdev-utils(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-loop = "libbd_loop.so.3()(64bit) ( ) libblockdev-loop(x86-64) ( =  3.2.0-4.el10_0) libblockdev-loop ( =  3.2.0-4.el10_0)"

URI_libblockdev-lvm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-lvm-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-lvm = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libudev.so.1()(64bit) ( ) libbd_utils.so.3()(64bit) ( ) libkmod.so.2()(64bit) ( ) libdevmapper.so.1.02()(64bit) ( ) libdevmapper.so.1.02(Base)(64bit) ( ) libdevmapper.so.1.02(DM_1_02_197)(64bit) ( ) libyaml-0.so.2()(64bit) ( ) lvm2 ( ) libdevmapper.so.1.02(DM_1_02_97)(64bit) ( ) libblockdev-utils(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-lvm = "libbd_lvm.so.3()(64bit) ( ) libblockdev-lvm ( =  3.2.0-4.el10_0) libblockdev-lvm(x86-64) ( =  3.2.0-4.el10_0)"

URI_libblockdev-lvm-dbus = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-lvm-dbus-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-lvm-dbus = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libudev.so.1()(64bit) ( ) libbd_utils.so.3()(64bit) ( ) libkmod.so.2()(64bit) ( ) libc.so.6(GLIBC_2.7)(64bit) ( ) libdevmapper.so.1.02()(64bit) ( ) libdevmapper.so.1.02(Base)(64bit) ( ) libdevmapper.so.1.02(DM_1_02_197)(64bit) ( ) libyaml-0.so.2()(64bit) ( ) libdevmapper.so.1.02(DM_1_02_97)(64bit) ( ) libblockdev-utils(x86-64) ( =  3.2.0-4.el10_0) lvm2-dbusd ( >=  2.02.156)"
RPROVIDES:libblockdev-lvm-dbus = "libbd_lvm-dbus.so.3()(64bit) ( ) config(libblockdev-lvm-dbus) ( =  3.2.0-4.el10_0) libblockdev-lvm-dbus ( =  3.2.0-4.el10_0) libblockdev-lvm-dbus(x86-64) ( =  3.2.0-4.el10_0)"

URI_libblockdev-mdraid = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-mdraid-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-mdraid = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libudev.so.1()(64bit) ( ) libbd_utils.so.3()(64bit) ( ) libkmod.so.2()(64bit) ( ) libc.so.6(GLIBC_2.27)(64bit) ( ) libbytesize.so.1()(64bit) ( ) mdadm ( ) libblockdev-utils(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-mdraid = "libbd_mdraid.so.3()(64bit) ( ) libblockdev-mdraid(x86-64) ( =  3.2.0-4.el10_0) libblockdev-mdraid ( =  3.2.0-4.el10_0)"

URI_libblockdev-mpath = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-mpath-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-mpath = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libudev.so.1()(64bit) ( ) libbd_utils.so.3()(64bit) ( ) libkmod.so.2()(64bit) ( ) libdevmapper.so.1.02()(64bit) ( ) libdevmapper.so.1.02(Base)(64bit) ( ) libdevmapper.so.1.02(DM_1_02_197)(64bit) ( ) libdevmapper.so.1.02(DM_1_02_97)(64bit) ( ) libblockdev-utils(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-mpath = "libbd_mpath.so.3()(64bit) ( ) libblockdev-mpath(x86-64) ( =  3.2.0-4.el10_0) libblockdev-mpath ( =  3.2.0-4.el10_0)"

URI_libblockdev-nvdimm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-nvdimm-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-nvdimm = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libudev.so.1()(64bit) ( ) libbd_utils.so.3()(64bit) ( ) libkmod.so.2()(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) ndctl ( ) libndctl.so.6()(64bit) ( ) libndctl.so.6(LIBNDCTL_1)(64bit) ( ) libndctl.so.6(LIBNDCTL_3)(64bit) ( ) libblockdev-utils(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-nvdimm = "libbd_nvdimm.so.3()(64bit) ( ) libblockdev-nvdimm(x86-64) ( =  3.2.0-4.el10_0) libblockdev-nvdimm ( =  3.2.0-4.el10_0)"

URI_libblockdev-nvme = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-nvme-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-nvme = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libudev.so.1()(64bit) ( ) libbd_utils.so.3()(64bit) ( ) libkmod.so.2()(64bit) ( ) libc.so.6(GLIBC_2.6)(64bit) ( ) libnvme.so.1()(64bit) ( ) libnvme.so.1(LIBNVME_1_0)(64bit) ( ) libnvme.so.1(LIBNVME_1_2)(64bit) ( ) libnvme.so.1(LIBNVME_1_4)(64bit) ( ) libblockdev-utils(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-nvme = "libbd_nvme.so.3()(64bit) ( ) libblockdev-nvme(x86-64) ( =  3.2.0-4.el10_0) libblockdev-nvme ( =  3.2.0-4.el10_0)"

URI_libblockdev-part = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-part-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-part = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libudev.so.1()(64bit) ( ) libbd_utils.so.3()(64bit) ( ) libkmod.so.2()(64bit) ( ) util-linux ( ) libc.so.6(GLIBC_2.6)(64bit) ( ) libfdisk.so.1()(64bit) ( ) libfdisk.so.1(FDISK_2.26)(64bit) ( ) libfdisk.so.1(FDISK_2.27)(64bit) ( ) libfdisk.so.1(FDISK_2.31)(64bit) ( ) libblockdev-utils(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-part = "libbd_part.so.3()(64bit) ( ) libblockdev-part(x86-64) ( =  3.2.0-4.el10_0) libblockdev-part ( =  3.2.0-4.el10_0)"

URI_libblockdev-plugins-all = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-plugins-all-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-plugins-all = "libblockdev(x86-64) ( =  3.2.0-4.el10_0) libblockdev-crypto(x86-64) ( =  3.2.0-4.el10_0) libblockdev-dm(x86-64) ( =  3.2.0-4.el10_0) libblockdev-fs(x86-64) ( =  3.2.0-4.el10_0) libblockdev-loop(x86-64) ( =  3.2.0-4.el10_0) libblockdev-lvm(x86-64) ( =  3.2.0-4.el10_0) libblockdev-mdraid(x86-64) ( =  3.2.0-4.el10_0) libblockdev-mpath(x86-64) ( =  3.2.0-4.el10_0) libblockdev-nvdimm(x86-64) ( =  3.2.0-4.el10_0) libblockdev-nvme(x86-64) ( =  3.2.0-4.el10_0) libblockdev-part(x86-64) ( =  3.2.0-4.el10_0) libblockdev-smart(x86-64) ( =  3.2.0-4.el10_0) libblockdev-smartmontools(x86-64) ( =  3.2.0-4.el10_0) libblockdev-swap(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-plugins-all = "libblockdev-plugins-all ( =  3.2.0-4.el10_0) libblockdev-plugins-all(x86-64) ( =  3.2.0-4.el10_0)"

URI_libblockdev-smart = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-smart-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-smart = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libudev.so.1()(64bit) ( ) libbd_utils.so.3()(64bit) ( ) libkmod.so.2()(64bit) ( ) libc.so.6(GLIBC_2.6)(64bit) ( ) libatasmart.so.4()(64bit) ( ) libblockdev-utils(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-smart = "libbd_smart.so.3()(64bit) ( ) libblockdev-smart(x86-64) ( =  3.2.0-4.el10_0) libblockdev-smart ( =  3.2.0-4.el10_0)"

URI_libblockdev-smartmontools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-smartmontools-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-smartmontools = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libudev.so.1()(64bit) ( ) libbd_utils.so.3()(64bit) ( ) libkmod.so.2()(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) libc.so.6(GLIBC_2.7)(64bit) ( ) libblockdev-utils(x86-64) ( =  3.2.0-4.el10_0) smartmontools ( >=  7.0)"
RPROVIDES:libblockdev-smartmontools = "libbd_smartmontools.so.3()(64bit) ( ) libblockdev-smartmontools(x86-64) ( =  3.2.0-4.el10_0) libblockdev-smartmontools ( =  3.2.0-4.el10_0)"

URI_libblockdev-swap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-swap-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-swap = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libudev.so.1()(64bit) ( ) libbd_utils.so.3()(64bit) ( ) libkmod.so.2()(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) util-linux ( ) libblkid.so.1()(64bit) ( ) libblkid.so.1(BLKID_2.17)(64bit) ( ) libblkid.so.1(BLKID_2.15)(64bit) ( ) libblockdev-utils(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-swap = "libbd_swap.so.3()(64bit) ( ) libblockdev-swap(x86-64) ( =  3.2.0-4.el10_0) libblockdev-swap ( =  3.2.0-4.el10_0)"

URI_libblockdev-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-tools-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libblockdev.so.3()(64bit) ( ) libbytesize.so.1()(64bit) ( ) libparted.so.2()(64bit) ( ) libparted-fs-resize.so.0()(64bit) ( ) libparted-fs-resize.so.0(LIBPARTED_FS_RESIZE_0.0.0)(64bit) ( ) libblockdev ( =  3.2.0-4.el10_0) libblockdev-lvm ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-tools = "libblockdev-tools ( =  3.2.0-4.el10_0) libblockdev-tools(x86-64) ( =  3.2.0-4.el10_0)"

URI_libblockdev-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-utils-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-utils = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libudev.so.1()(64bit) ( ) libkmod.so.2()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( ) libkmod.so.2(LIBKMOD_5)(64bit) ( )"
RPROVIDES:libblockdev-utils = "libbd_utils.so.3()(64bit) ( ) libblockdev-utils(x86-64) ( =  3.2.0-4.el10_0) libblockdev-utils ( =  3.2.0-4.el10_0)"

URI_python3-blockdev = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-blockdev-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-blockdev = "python3-gobject-base ( ) python3-bytesize ( ) python(abi) ( =  3.12) libblockdev(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:python3-blockdev = "python-blockdev ( =  3.2.0-4.el10_0) python3-blockdev ( =  3.2.0-4.el10_0) python3-blockdev(x86-64) ( =  3.2.0-4.el10_0) python3.12-blockdev ( =  3.2.0-4.el10_0)"

URI_libblockdev-crypto-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-crypto-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-crypto-devel = "glib2-devel ( ) libbd_crypto.so.3()(64bit) ( ) libblockdev-utils-devel(x86-64) ( =  3.2.0-4.el10_0) libblockdev-crypto(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-crypto-devel = "libblockdev-crypto-devel ( =  3.2.0-4.el10_0) libblockdev-crypto-devel(x86-64) ( =  3.2.0-4.el10_0)"

URI_libblockdev-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-devel = "/usr/bin/pkg-config ( ) glib2-devel ( ) pkgconfig(glib-2.0) ( ) libblockdev.so.3()(64bit) ( ) libblockdev-utils-devel(x86-64) ( =  3.2.0-4.el10_0) libblockdev(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-devel = "pkgconfig(blockdev) ( =  3.2.0) libblockdev-devel ( =  3.2.0-4.el10_0) libblockdev-devel(x86-64) ( =  3.2.0-4.el10_0) libblockdev-kbd-devel ( =  3.2.0-4.el10_0) libblockdev-vdo-devel ( =  3.2.0-4.el10_0)"

URI_libblockdev-dm-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-dm-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-dm-devel = "glib2-devel ( ) device-mapper-devel ( ) libbd_dm.so.3()(64bit) ( ) systemd-devel ( ) libblockdev-utils-devel(x86-64) ( =  3.2.0-4.el10_0) libblockdev-dm(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-dm-devel = "libblockdev-dm-devel ( =  3.2.0-4.el10_0) libblockdev-dm-devel(x86-64) ( =  3.2.0-4.el10_0)"

URI_libblockdev-fs-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-fs-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-fs-devel = "glib2-devel ( ) libbd_fs.so.3()(64bit) ( ) libblockdev-utils-devel(x86-64) ( =  3.2.0-4.el10_0) libblockdev-fs(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-fs-devel = "libblockdev-fs-devel ( =  3.2.0-4.el10_0) libblockdev-fs-devel(x86-64) ( =  3.2.0-4.el10_0)"

URI_libblockdev-loop-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-loop-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-loop-devel = "glib2-devel ( ) libbd_loop.so.3()(64bit) ( ) libblockdev-utils-devel(x86-64) ( =  3.2.0-4.el10_0) libblockdev-loop(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-loop-devel = "libblockdev-loop-devel ( =  3.2.0-4.el10_0) libblockdev-loop-devel(x86-64) ( =  3.2.0-4.el10_0)"

URI_libblockdev-lvm-dbus-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-lvm-dbus-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-lvm-dbus-devel = "glib2-devel ( ) libbd_lvm-dbus.so.3()(64bit) ( ) libblockdev-utils-devel(x86-64) ( =  3.2.0-4.el10_0) libblockdev-lvm-dbus(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-lvm-dbus-devel = "libblockdev-lvm-dbus-devel ( =  3.2.0-4.el10_0) libblockdev-lvm-dbus-devel(x86-64) ( =  3.2.0-4.el10_0)"

URI_libblockdev-lvm-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-lvm-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-lvm-devel = "glib2-devel ( ) libbd_lvm.so.3()(64bit) ( ) libblockdev-utils-devel(x86-64) ( =  3.2.0-4.el10_0) libblockdev-lvm(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-lvm-devel = "libblockdev-lvm-devel ( =  3.2.0-4.el10_0) libblockdev-lvm-devel(x86-64) ( =  3.2.0-4.el10_0)"

URI_libblockdev-mdraid-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-mdraid-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-mdraid-devel = "glib2-devel ( ) libbd_mdraid.so.3()(64bit) ( ) libblockdev-utils-devel(x86-64) ( =  3.2.0-4.el10_0) libblockdev-mdraid(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-mdraid-devel = "libblockdev-mdraid-devel ( =  3.2.0-4.el10_0) libblockdev-mdraid-devel(x86-64) ( =  3.2.0-4.el10_0)"

URI_libblockdev-mpath-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-mpath-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-mpath-devel = "glib2-devel ( ) libbd_mpath.so.3()(64bit) ( ) libblockdev-utils-devel(x86-64) ( =  3.2.0-4.el10_0) libblockdev-mpath(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-mpath-devel = "libblockdev-mpath-devel ( =  3.2.0-4.el10_0) libblockdev-mpath-devel(x86-64) ( =  3.2.0-4.el10_0)"

URI_libblockdev-nvdimm-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-nvdimm-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-nvdimm-devel = "glib2-devel ( ) libbd_nvdimm.so.3()(64bit) ( ) libblockdev-utils-devel(x86-64) ( =  3.2.0-4.el10_0) libblockdev-nvdimm(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-nvdimm-devel = "libblockdev-nvdimm-devel ( =  3.2.0-4.el10_0) libblockdev-nvdimm-devel(x86-64) ( =  3.2.0-4.el10_0)"

URI_libblockdev-nvme-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-nvme-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-nvme-devel = "glib2-devel ( ) libbd_nvme.so.3()(64bit) ( ) libblockdev-utils-devel(x86-64) ( =  3.2.0-4.el10_0) libblockdev-nvme(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-nvme-devel = "libblockdev-nvme-devel ( =  3.2.0-4.el10_0) libblockdev-nvme-devel(x86-64) ( =  3.2.0-4.el10_0)"

URI_libblockdev-part-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-part-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-part-devel = "glib2-devel ( ) libbd_part.so.3()(64bit) ( ) libblockdev-utils-devel(x86-64) ( =  3.2.0-4.el10_0) libblockdev-part(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-part-devel = "libblockdev-part-devel ( =  3.2.0-4.el10_0) libblockdev-part-devel(x86-64) ( =  3.2.0-4.el10_0)"

URI_libblockdev-smart-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-smart-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-smart-devel = "glib2-devel ( ) libbd_smart.so.3()(64bit) ( ) libblockdev-utils-devel(x86-64) ( =  3.2.0-4.el10_0) libblockdev-smart(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-smart-devel = "libblockdev-smart-devel ( =  3.2.0-4.el10_0) libblockdev-smart-devel(x86-64) ( =  3.2.0-4.el10_0)"

URI_libblockdev-smartmontools-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-smartmontools-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-smartmontools-devel = "glib2-devel ( ) libbd_smartmontools.so.3()(64bit) ( ) libblockdev-utils-devel(x86-64) ( =  3.2.0-4.el10_0) libblockdev-smartmontools(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-smartmontools-devel = "libblockdev-smartmontools-devel ( =  3.2.0-4.el10_0) libblockdev-smartmontools-devel(x86-64) ( =  3.2.0-4.el10_0)"

URI_libblockdev-swap-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-swap-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-swap-devel = "glib2-devel ( ) libbd_swap.so.3()(64bit) ( ) libblockdev-utils-devel(x86-64) ( =  3.2.0-4.el10_0) libblockdev-swap(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-swap-devel = "libblockdev-swap-devel ( =  3.2.0-4.el10_0) libblockdev-swap-devel(x86-64) ( =  3.2.0-4.el10_0)"

URI_libblockdev-utils-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-utils-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-utils-devel = "/usr/bin/pkg-config ( ) glib2-devel ( ) pkgconfig(glib-2.0) ( ) libbd_utils.so.3()(64bit) ( ) libblockdev-utils(x86-64) ( =  3.2.0-4.el10_0)"
RPROVIDES:libblockdev-utils-devel = "libblockdev-utils-devel(x86-64) ( =  3.2.0-4.el10_0) pkgconfig(blockdev-utils) ( =  3.2.0) libblockdev-utils-devel ( =  3.2.0-4.el10_0)"

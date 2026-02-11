
PN = "iscsi-initiator-utils"
PE = "0"
PV = "6.2.1.9"
PR = "22.gita65a472.el10"
PACKAGES = "iscsi-initiator-utils iscsi-initiator-utils-iscsiuio python3-iscsi-initiator-utils iscsi-initiator-utils-devel"


URI_iscsi-initiator-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/iscsi-initiator-utils-6.2.1.9-22.gita65a472.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:iscsi-initiator-utils = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) /usr/bin/sh ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libsystemd.so.0()(64bit) ( ) /usr/bin/bash ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libmount.so.1()(64bit) ( ) libmount.so.1(MOUNT_2.19)(64bit) ( ) libkmod.so.2()(64bit) ( ) libkmod.so.2(LIBKMOD_5)(64bit) ( ) libmount.so.1(MOUNT_2.22)(64bit) ( ) libisns.so.0()(64bit) ( ) libisns.so.0(LIBISNS_0.96)(64bit) ( ) fedora-release-common ( if  fedora-release-common) iscsi-initiator-utils-iscsiuio ( >=  6.2.1.9-22.gita65a472.el10)"
RPROVIDES:iscsi-initiator-utils = "libiscsi.so.0()(64bit) ( ) libopeniscsiusr.so.0()(64bit) ( ) iscsi-initiator-utils ( =  6.2.1.9-22.gita65a472.el10) config(iscsi-initiator-utils) ( =  6.2.1.9-22.gita65a472.el10) iscsi-initiator-utils(x86-64) ( =  6.2.1.9-22.gita65a472.el10)"

URI_iscsi-initiator-utils-iscsiuio = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/iscsi-initiator-utils-iscsiuio-6.2.1.9-22.gita65a472.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:iscsi-initiator-utils-iscsiuio = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) iscsi-initiator-utils ( =  6.2.1.9-22.gita65a472.el10)"
RPROVIDES:iscsi-initiator-utils-iscsiuio = "config(iscsi-initiator-utils-iscsiuio) ( =  6.2.1.9-22.gita65a472.el10) iscsi-initiator-utils-iscsiuio ( =  6.2.1.9-22.gita65a472.el10) iscsi-initiator-utils-iscsiuio(x86-64) ( =  6.2.1.9-22.gita65a472.el10)"

URI_python3-iscsi-initiator-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-iscsi-initiator-utils-6.2.1.9-22.gita65a472.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-iscsi-initiator-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libiscsi.so.0()(64bit) ( ) python(abi) ( =  3.12) iscsi-initiator-utils ( =  6.2.1.9-22.gita65a472.el10)"
RPROVIDES:python3-iscsi-initiator-utils = "python-iscsi-initiator-utils ( =  6.2.1.9-22.gita65a472.el10) python3-iscsi-initiator-utils ( =  6.2.1.9-22.gita65a472.el10) python3-iscsi-initiator-utils(x86-64) ( =  6.2.1.9-22.gita65a472.el10) python3.12-iscsi-initiator-utils ( =  6.2.1.9-22.gita65a472.el10) python3.12dist(pyiscsi) ( =  1) python3dist(pyiscsi) ( =  1)"

URI_iscsi-initiator-utils-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/iscsi-initiator-utils-devel-6.2.1.9-22.gita65a472.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:iscsi-initiator-utils-devel = "/usr/bin/pkg-config ( ) libiscsi.so.0()(64bit) ( ) libopeniscsiusr.so.0()(64bit) ( ) iscsi-initiator-utils ( =  6.2.1.9-22.gita65a472.el10)"
RPROVIDES:iscsi-initiator-utils-devel = "iscsi-initiator-utils-devel ( =  6.2.1.9-22.gita65a472.el10) iscsi-initiator-utils-devel(x86-64) ( =  6.2.1.9-22.gita65a472.el10) pkgconfig(libopeniscsiusr) ( =  0.2.0)"

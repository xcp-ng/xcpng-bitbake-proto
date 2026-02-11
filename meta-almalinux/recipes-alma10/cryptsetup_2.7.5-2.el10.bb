
PN = "cryptsetup"
PE = "0"
PV = "2.7.5"
PR = "2.el10"
PACKAGES = "cryptsetup cryptsetup-libs integritysetup veritysetup cryptsetup-devel"


URI_cryptsetup = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cryptsetup-2.7.5-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cryptsetup = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpopt.so.0()(64bit) ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libblkid.so.1()(64bit) ( ) libblkid.so.1(BLKID_2.15)(64bit) ( ) libblkid.so.1(BLKID_2.17)(64bit) ( ) libcryptsetup.so.12()(64bit) ( ) libcryptsetup.so.12(CRYPTSETUP_2.4)(64bit) ( ) libblkid.so.1(BLKID_2.21)(64bit) ( ) libcryptsetup.so.12(CRYPTSETUP_2.0)(64bit) ( ) libcryptsetup.so.12(CRYPTSETUP_2.7)(64bit) ( ) libpwquality.so.1()(64bit) ( ) libpwquality.so.1(LIBPWQUALITY_1.0)(64bit) ( ) libcryptsetup.so.12(CRYPTSETUP_2.6)(64bit) ( ) cryptsetup-libs ( =  2.7.5-2.el10) libpwquality ( >=  1.2.0)"
RPROVIDES:cryptsetup = "cryptsetup ( =  2.7.5-2.el10) cryptsetup(x86-64) ( =  2.7.5-2.el10) cryptsetup-reencrypt ( =  2.7.5)"

URI_cryptsetup-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cryptsetup-libs-2.7.5-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cryptsetup-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libuuid.so.1()(64bit) ( ) libdevmapper.so.1.02()(64bit) ( ) libdevmapper.so.1.02(Base)(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libdevmapper.so.1.02(DM_1_02_197)(64bit) ( ) libblkid.so.1()(64bit) ( ) libblkid.so.1(BLKID_2.15)(64bit) ( ) libblkid.so.1(BLKID_2.17)(64bit) ( ) libjson-c.so.5()(64bit) ( ) libjson-c.so.5(JSONC_0.14)(64bit) ( ) libdevmapper.so.1.02(DM_1_02_97)(64bit) ( ) libdevmapper.so.1.02(DM_1_02_98)(64bit) ( ) libcrypto.so.3(OPENSSL_3.2.0)(64bit) ( )"
RPROVIDES:cryptsetup-libs = "libcryptsetup.so.12()(64bit) ( ) libcryptsetup.so.12(CRYPTSETUP_2.4)(64bit) ( ) libcryptsetup.so.12(CRYPTSETUP_2.0)(64bit) ( ) libcryptsetup.so.12(CRYPTSETUP_2.7)(64bit) ( ) libcryptsetup.so.12(CRYPTSETUP_2.6)(64bit) ( ) libcryptsetup.so.12(CRYPTSETUP_2.5)(64bit) ( ) cryptsetup-libs ( =  2.7.5-2.el10) cryptsetup-libs(x86-64) ( =  2.7.5-2.el10)"

URI_integritysetup = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/integritysetup-2.7.5-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:integritysetup = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpopt.so.0()(64bit) ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libblkid.so.1()(64bit) ( ) libblkid.so.1(BLKID_2.15)(64bit) ( ) libblkid.so.1(BLKID_2.17)(64bit) ( ) libcryptsetup.so.12()(64bit) ( ) libcryptsetup.so.12(CRYPTSETUP_2.4)(64bit) ( ) libblkid.so.1(BLKID_2.21)(64bit) ( ) libcryptsetup.so.12(CRYPTSETUP_2.0)(64bit) ( ) cryptsetup-libs ( =  2.7.5-2.el10)"
RPROVIDES:integritysetup = "integritysetup ( =  2.7.5-2.el10) integritysetup(x86-64) ( =  2.7.5-2.el10)"

URI_veritysetup = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/veritysetup-2.7.5-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:veritysetup = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpopt.so.0()(64bit) ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( ) libcryptsetup.so.12()(64bit) ( ) libcryptsetup.so.12(CRYPTSETUP_2.4)(64bit) ( ) libcryptsetup.so.12(CRYPTSETUP_2.0)(64bit) ( ) cryptsetup-libs ( =  2.7.5-2.el10)"
RPROVIDES:veritysetup = "veritysetup ( =  2.7.5-2.el10) veritysetup(x86-64) ( =  2.7.5-2.el10)"

URI_cryptsetup-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cryptsetup-devel-2.7.5-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cryptsetup-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) pkgconfig(openssl) ( ) pkgconfig(uuid) ( ) pkgconfig(json-c) ( ) pkgconfig(blkid) ( ) pkgconfig(devmapper) ( ) libcryptsetup.so.12()(64bit) ( ) cryptsetup-libs(x86-64) ( =  2.7.5-2.el10)"
RPROVIDES:cryptsetup-devel = "cryptsetup-devel ( =  2.7.5-2.el10) cryptsetup-devel(x86-64) ( =  2.7.5-2.el10) pkgconfig(libcryptsetup) ( =  2.7.5)"

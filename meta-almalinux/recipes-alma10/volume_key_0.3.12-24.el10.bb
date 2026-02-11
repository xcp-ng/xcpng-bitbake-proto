
PN = "volume_key"
PE = "0"
PV = "0.3.12"
PR = "24.el10"
PACKAGES = "python3-volume_key volume_key volume_key-libs volume_key-devel"


URI_python3-volume_key = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-volume_key-0.3.12-24.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-volume_key = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libnspr4.so()(64bit) ( ) libnss3.so()(64bit) ( ) libplc4.so()(64bit) ( ) libnss3.so(NSS_3.2)(64bit) ( ) libnssutil3.so()(64bit) ( ) libplds4.so()(64bit) ( ) libsmime3.so()(64bit) ( ) libssl3.so()(64bit) ( ) libsmime3.so(NSS_3.4)(64bit) ( ) libblkid.so.1()(64bit) ( ) libgpgme.so.11()(64bit) ( ) libcryptsetup.so.12()(64bit) ( ) libvolume_key.so.1()(64bit) ( ) python(abi) ( =  3.12) volume_key-libs(x86-64) ( =  0.3.12-24.el10)"
RPROVIDES:python3-volume_key = "python-volume_key ( =  0.3.12-24.el10) python3-volume_key ( =  0.3.12-24.el10) python3-volume_key(x86-64) ( =  0.3.12-24.el10) python3.12-volume_key ( =  0.3.12-24.el10)"

URI_volume_key = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/volume_key-0.3.12-24.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:volume_key = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libnspr4.so()(64bit) ( ) libnss3.so()(64bit) ( ) libplc4.so()(64bit) ( ) libnss3.so(NSS_3.2)(64bit) ( ) libsmime3.so()(64bit) ( ) libsmime3.so(NSS_3.4)(64bit) ( ) libvolume_key.so.1()(64bit) ( ) volume_key-libs(x86-64) ( =  0.3.12-24.el10)"
RPROVIDES:volume_key = "volume_key ( =  0.3.12-24.el10) volume_key(x86-64) ( =  0.3.12-24.el10)"

URI_volume_key-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/volume_key-libs-0.3.12-24.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:volume_key-libs = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libnspr4.so()(64bit) ( ) libnss3.so()(64bit) ( ) libplc4.so()(64bit) ( ) libnss3.so(NSS_3.2)(64bit) ( ) libnssutil3.so()(64bit) ( ) libplds4.so()(64bit) ( ) libsmime3.so()(64bit) ( ) libssl3.so()(64bit) ( ) libnss3.so(NSS_3.3)(64bit) ( ) libblkid.so.1()(64bit) ( ) libsmime3.so(NSS_3.2)(64bit) ( ) libgpgme.so.11()(64bit) ( ) libgpgme.so.11(GPGME_1.0)(64bit) ( ) libgpgme.so.11(GPGME_1.1)(64bit) ( ) libblkid.so.1(BLKID_1.0)(64bit) ( ) libcryptsetup.so.12()(64bit) ( ) libcryptsetup.so.12(CRYPTSETUP_2.0)(64bit) ( ) /usr/bin/gpg2 ( )"
RPROVIDES:volume_key-libs = "libvolume_key.so.1()(64bit) ( ) volume_key-libs(x86-64) ( =  0.3.12-24.el10) volume_key-libs ( =  0.3.12-24.el10)"

URI_volume_key-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/volume_key-devel-0.3.12-24.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:volume_key-devel = "libvolume_key.so.1()(64bit) ( ) volume_key-libs(x86-64) ( =  0.3.12-24.el10)"
RPROVIDES:volume_key-devel = "volume_key-devel ( =  0.3.12-24.el10) volume_key-devel(x86-64) ( =  0.3.12-24.el10)"

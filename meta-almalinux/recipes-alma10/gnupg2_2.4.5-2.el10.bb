
PN = "gnupg2"
PE = "0"
PV = "2.4.5"
PR = "2.el10"
PACKAGES = "gnupg2 gnupg2-smime"


URI_gnupg2 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gnupg2-2.4.5-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnupg2 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) libz.so.1()(64bit) ( ) libgnutls.so.30()(64bit) ( ) libldap.so.2()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libldap.so.2(OPENLDAP_2.200)(64bit) ( ) liblber.so.2()(64bit) ( ) liblber.so.2(OPENLDAP_2.200)(64bit) ( ) libreadline.so.8()(64bit) ( ) libbz2.so.1()(64bit) ( ) libsqlite3.so.0()(64bit) ( ) libgpg-error.so.0()(64bit) ( ) libgpg-error.so.0(GPG_ERROR_1.0)(64bit) ( ) libtss2-esys.so.0()(64bit) ( ) libtss2-mu.so.0()(64bit) ( ) libtss2-rc.so.0()(64bit) ( ) libtss2-tctildr.so.0()(64bit) ( ) libassuan.so.0()(64bit) ( ) libassuan.so.0(LIBASSUAN_1.0)(64bit) ( ) libgcrypt.so.20()(64bit) ( ) libgcrypt.so.20(GCRYPT_1.6)(64bit) ( ) libksba.so.8()(64bit) ( ) libksba.so.8(KSBA_0.9)(64bit) ( ) libnpth.so.0()(64bit) ( ) libnpth.so.0(NPTH_1.0)(64bit) ( ) libgcrypt ( >=  1.9.1) libgpg-error ( >=  1.46)"
RPROVIDES:gnupg2 = "config(gnupg2) ( =  2.4.5-2.el10) dirmngr ( =  2.4.5-2.el10) gnupg ( =  2.4.5-2.el10) gnupg2 ( =  2.4.5-2.el10) gnupg2(x86-64) ( =  2.4.5-2.el10) gpg ( =  2.4.5-2.el10)"

URI_gnupg2-smime = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnupg2-smime-2.4.5-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnupg2-smime = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libreadline.so.8()(64bit) ( ) libgcrypt.so.20()(64bit) ( ) libgcrypt.so.20(GCRYPT_1.6)(64bit) ( ) libgpg-error.so.0()(64bit) ( ) libgpg-error.so.0(GPG_ERROR_1.0)(64bit) ( ) libassuan.so.0()(64bit) ( ) libassuan.so.0(LIBASSUAN_1.0)(64bit) ( ) libksba.so.8()(64bit) ( ) libksba.so.8(KSBA_0.9)(64bit) ( ) libnpth.so.0()(64bit) ( ) libnpth.so.0(NPTH_1.0)(64bit) ( ) gnupg2(x86-64) ( =  2.4.5-2.el10)"
RPROVIDES:gnupg2-smime = "gnupg2-smime ( =  2.4.5-2.el10) gnupg2-smime(x86-64) ( =  2.4.5-2.el10)"


PN = "swtpm"
PE = "0"
PV = "0.9.0"
PR = "5.el10"
PACKAGES = "swtpm swtpm-libs swtpm-selinux swtpm-tools swtpm-devel swtpm-tools-pkcs11"


URI_swtpm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/swtpm-0.9.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:swtpm = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libtpms.so.0()(64bit) ( ) libtpms.so.0(LIBTPMS_0.5.1)(64bit) ( ) libswtpm_libtpms.so.0()(64bit) ( ) swtpm-libs ( =  0.9.0-5.el10) swtpm-selinux ( if  selinux-policy-targeted) libtpms ( >=  0.6.0)"
RPROVIDES:swtpm = "swtpm ( =  0.9.0-5.el10) swtpm(x86-64) ( =  0.9.0-5.el10)"

URI_swtpm-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/swtpm-libs-0.9.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:swtpm-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libseccomp.so.2()(64bit) ( ) libtpms.so.0()(64bit) ( ) libtpms.so.0(LIBTPMS_0.5.1)(64bit) ( ) libtpms.so.0(LIBTPMS_0.6.0)(64bit) ( )"
RPROVIDES:swtpm-libs = "libswtpm_libtpms.so.0()(64bit) ( ) swtpm-libs ( =  0.9.0-5.el10) swtpm-libs(x86-64) ( =  0.9.0-5.el10)"

URI_swtpm-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/swtpm-selinux-0.9.0-5.el10.noarch.rpm;unpack=0"
RDEPENDS:swtpm-selinux = "/bin/sh ( ) policycoreutils ( ) policycoreutils-python-utils ( ) libselinux-utils ( ) selinux-policy-base ( >=  40.13.26) swtpm ( =  0.9.0-5.el10) selinux-policy ( >=  40.13.26)"
RPROVIDES:swtpm-selinux = "swtpm-selinux ( =  0.9.0-5.el10)"

URI_swtpm-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/swtpm-tools-0.9.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:swtpm-tools = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) /usr/bin/bash ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) libgmp.so.10()(64bit) ( ) bash ( ) libtasn1.so.6()(64bit) ( ) gnutls-utils ( ) libtasn1.so.6(LIBTASN1_0_3)(64bit) ( ) tpm2-tss ( ) swtpm ( =  0.9.0-5.el10)"
RPROVIDES:swtpm-tools = "config(swtpm-tools) ( =  0.9.0-5.el10) swtpm-tools ( =  0.9.0-5.el10) swtpm-tools(x86-64) ( =  0.9.0-5.el10)"

URI_swtpm-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/swtpm-devel-0.9.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:swtpm-devel = "swtpm-libs(x86-64) ( =  0.9.0-5.el10)"
RPROVIDES:swtpm-devel = "swtpm-devel ( =  0.9.0-5.el10) swtpm-devel(x86-64) ( =  0.9.0-5.el10)"

URI_swtpm-tools-pkcs11 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/swtpm-tools-pkcs11-0.9.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:swtpm-tools-pkcs11 = "/usr/bin/bash ( ) expect ( ) gnutls-utils ( ) tpm2-abrmd ( ) tpm2-pkcs11 ( ) tpm2-pkcs11-tools ( ) tpm2-tools ( ) swtpm-tools ( =  0.9.0-5.el10)"
RPROVIDES:swtpm-tools-pkcs11 = "swtpm-tools-pkcs11 ( =  0.9.0-5.el10) swtpm-tools-pkcs11(x86-64) ( =  0.9.0-5.el10)"

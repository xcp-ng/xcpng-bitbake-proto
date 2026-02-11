
PN = "cifs-utils"
PE = "0"
PV = "7.2"
PR = "0.el10_0.1"
PACKAGES = "cifs-utils pam_cifscreds cifs-utils-devel cifs-utils-info"


URI_cifs-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cifs-utils-7.2-0.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:cifs-utils = "/bin/sh ( ) /usr/sbin/alternatives ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libtalloc.so.2()(64bit) ( ) libtalloc.so.2(TALLOC_2.0.2)(64bit) ( ) libkrb5.so.3()(64bit) ( ) libkrb5.so.3(krb5_3_MIT)(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) libkeyutils.so.1()(64bit) ( ) libresolv.so.2()(64bit) ( ) libwbclient.so.0()(64bit) ( ) libwbclient.so.0(WBCLIENT_0.9)(64bit) ( ) libkeyutils.so.1(KEYUTILS_0.3)(64bit) ( ) libcap-ng.so.0()(64bit) ( ) libresolv.so.2(GLIBC_2.9)(64bit) ( ) keyutils ( ) libkeyutils.so.1(KEYUTILS_1.0)(64bit) ( )"
RPROVIDES:cifs-utils = "cifs-utils ( =  7.2-0.el10_0.1) cifs-utils(x86-64) ( =  7.2-0.el10_0.1) config(cifs-utils) ( =  7.2-0.el10_0.1)"

URI_pam_cifscreds = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pam_cifscreds-7.2-0.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:pam_cifscreds = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libresolv.so.2()(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) libtalloc.so.2()(64bit) ( ) libtalloc.so.2(TALLOC_2.0.2)(64bit) ( ) libkeyutils.so.1()(64bit) ( ) libresolv.so.2(GLIBC_2.9)(64bit) ( ) libkeyutils.so.1(KEYUTILS_0.3)(64bit) ( ) libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit) ( ) libkeyutils.so.1(KEYUTILS_1.0)(64bit) ( )"
RPROVIDES:pam_cifscreds = "pam_cifscreds ( =  7.2-0.el10_0.1) pam_cifscreds(x86-64) ( =  7.2-0.el10_0.1)"

URI_cifs-utils-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cifs-utils-devel-7.2-0.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:cifs-utils-devel = ""
RPROVIDES:cifs-utils-devel = "cifs-utils-devel ( =  7.2-0.el10_0.1) cifs-utils-devel(x86-64) ( =  7.2-0.el10_0.1)"

URI_cifs-utils-info = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cifs-utils-info-7.2-0.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:cifs-utils-info = "/usr/bin/python3 ( ) cifs-utils(x86-64) ( =  7.2-0.el10_0.1)"
RPROVIDES:cifs-utils-info = "cifs-utils-info(x86-64) ( =  7.2-0.el10_0.1) cifs-utils-info ( =  7.2-0.el10_0.1)"

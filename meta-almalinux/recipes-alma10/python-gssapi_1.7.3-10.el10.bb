
PN = "python-gssapi"
PE = "0"
PV = "1.7.3"
PR = "10.el10"
PACKAGES = "python3-gssapi"


URI_python3-gssapi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-gssapi-1.7.3-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-gssapi = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) python3.12dist(decorator) ( ) python(abi) ( =  3.12) krb5-libs ( >=  1.19)"
RPROVIDES:python3-gssapi = "python-gssapi ( =  1.7.3-10.el10) python3-gssapi ( =  1.7.3-10.el10) python3-gssapi(x86-64) ( =  1.7.3-10.el10) python3.12-gssapi ( =  1.7.3-10.el10) python3.12dist(gssapi) ( =  1.7.3) python3dist(gssapi) ( =  1.7.3)"

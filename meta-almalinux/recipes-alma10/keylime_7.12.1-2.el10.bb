
PN = "keylime"
PE = "0"
PV = "7.12.1"
PR = "2.el10"
PACKAGES = "keylime keylime-base keylime-registrar keylime-selinux keylime-tenant keylime-tools keylime-verifier python3-keylime"


URI_keylime = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/keylime-7.12.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:keylime = "keylime-agent ( ) keylime-base ( =  7.12.1-2.el10) python3-keylime ( =  7.12.1-2.el10) keylime-registrar ( =  7.12.1-2.el10) keylime-tenant ( =  7.12.1-2.el10) keylime-tools ( =  7.12.1-2.el10) keylime-verifier ( =  7.12.1-2.el10)"
RPROVIDES:keylime = "keylime ( =  7.12.1-2.el10) keylime(x86-64) ( =  7.12.1-2.el10)"

URI_keylime-base = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/keylime-base-7.12.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:keylime-base = "/bin/sh ( ) shadow-utils ( ) python3-jinja2 ( ) /usr/bin/sh ( ) /usr/bin/python3 ( ) openssl ( ) procps-ng ( ) tpm2-tss ( ) efivar-libs ( )"
RPROVIDES:keylime-base = "group(keylime) ( ) keylime-base ( =  7.12.1-2.el10) config(keylime-base) ( =  7.12.1-2.el10) keylime-base(x86-64) ( =  7.12.1-2.el10) user(keylime) ( =  dSBrZXlsaW1lIC0gIktleWxpbWUgdW5wcml2aWxlZ2VkIHVzZXIiIC92YXIvbGliL2tleWxpbWUgL3Vzci9zYmluL25vbG9naW4A)"

URI_keylime-registrar = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/keylime-registrar-7.12.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:keylime-registrar = "/bin/sh ( ) /usr/bin/python3 ( ) keylime-base ( =  7.12.1-2.el10) python3-keylime ( =  7.12.1-2.el10)"
RPROVIDES:keylime-registrar = "keylime-registrar ( =  7.12.1-2.el10) config(keylime-registrar) ( =  7.12.1-2.el10) keylime-registrar(x86-64) ( =  7.12.1-2.el10)"

URI_keylime-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/keylime-selinux-7.12.1-2.el10.noarch.rpm;unpack=0"
RDEPENDS:keylime-selinux = "/bin/sh ( ) selinux-policy-targeted ( ) policycoreutils ( ) policycoreutils-python-utils ( ) libselinux-utils ( ) selinux-policy-base ( >=  40.13.25) selinux-policy ( >=  40.13.25)"
RPROVIDES:keylime-selinux = "keylime-selinux ( =  7.12.1-2.el10)"

URI_keylime-tenant = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/keylime-tenant-7.12.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:keylime-tenant = "/bin/sh ( ) /usr/bin/python3 ( ) keylime-base ( =  7.12.1-2.el10) python3-keylime ( =  7.12.1-2.el10)"
RPROVIDES:keylime-tenant = "keylime-tenant ( =  7.12.1-2.el10) config(keylime-tenant) ( =  7.12.1-2.el10) keylime-tenant(x86-64) ( =  7.12.1-2.el10)"

URI_keylime-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/keylime-tools-7.12.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:keylime-tools = "/usr/bin/python3 ( ) keylime-base ( =  7.12.1-2.el10) python3-keylime ( =  7.12.1-2.el10)"
RPROVIDES:keylime-tools = "keylime-tools ( =  7.12.1-2.el10) keylime-tools(x86-64) ( =  7.12.1-2.el10)"

URI_keylime-verifier = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/keylime-verifier-7.12.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:keylime-verifier = "/bin/sh ( ) /usr/bin/python3 ( ) keylime-base ( =  7.12.1-2.el10) python3-keylime ( =  7.12.1-2.el10)"
RPROVIDES:keylime-verifier = "keylime-verifier ( =  7.12.1-2.el10) config(keylime-verifier) ( =  7.12.1-2.el10) keylime-verifier(x86-64) ( =  7.12.1-2.el10)"

URI_python3-keylime = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-keylime-7.12.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-keylime = "/usr/bin/python3 ( ) python3-requests ( ) python3-pyasn1 ( ) python3-cryptography ( ) python3-packaging ( ) python3-pyyaml ( ) python3-pyasn1-modules ( ) python3-psutil ( ) python3-tornado ( ) python3-typing-extensions ( ) python3-alembic ( ) python3-lark-parser ( ) python3-sqlalchemy ( ) tpm2-tools ( ) python3-gpg ( ) python3-jsonschema ( ) python(abi) ( =  3.12) keylime-base ( =  7.12.1-2.el10)"
RPROVIDES:python3-keylime = "python3-keylime ( =  7.12.1-2.el10) python-keylime ( =  7.12.1-2.el10) python3-keylime(x86-64) ( =  7.12.1-2.el10) python3.12-keylime ( =  7.12.1-2.el10) python3.12dist(keylime) ( =  7.12.1) python3dist(keylime) ( =  7.12.1)"

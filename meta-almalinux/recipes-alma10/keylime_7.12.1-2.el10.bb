
inherit dnf-bridge

PN = "keylime"
PE = "0"
PV = "7.12.1"
PR = "2.el10"
PACKAGES = "keylime keylime-base keylime-registrar keylime-selinux keylime-tenant keylime-tools keylime-verifier python3-keylime"


URI_keylime = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/keylime-7.12.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:keylime = " \
 keylime-agent-rust \
 keylime-base \
 keylime-registrar \
 keylime-tenant \
 keylime-tools \
 keylime-verifier \
 python3-keylime \
"

URI_keylime-base = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/keylime-base-7.12.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:keylime-base = " \
 python3 \
 shadow-utils \
 efivar-libs \
 openssl \
 python3-jinja2 \
 bash \
 tpm2-tss \
 procps-ng \
"

URI_keylime-registrar = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/keylime-registrar-7.12.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:keylime-registrar = " \
 python3 \
 python3-keylime \
 bash \
 keylime-base \
"

URI_keylime-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/keylime-selinux-7.12.1-2.el10.noarch.rpm;unpack=0"
RDEPENDS:keylime-selinux = " \
 policycoreutils-python-utils \
 policycoreutils \
 bash \
 selinux-policy \
 libselinux-utils \
 selinux-policy-targeted \
"

URI_keylime-tenant = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/keylime-tenant-7.12.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:keylime-tenant = " \
 python3 \
 python3-keylime \
 bash \
 keylime-base \
"

URI_keylime-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/keylime-tools-7.12.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:keylime-tools = " \
 python3 \
 python3-keylime \
 keylime-base \
"

URI_keylime-verifier = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/keylime-verifier-7.12.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:keylime-verifier = " \
 python3 \
 python3-keylime \
 bash \
 keylime-base \
"

URI_python3-keylime = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-keylime-7.12.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-keylime = " \
 python3 \
 python3-pyyaml \
 python3-requests \
 python3-psutil \
 python3-cryptography \
 python3-pyasn1 \
 python3-pyasn1-modules \
 python3-lark \
 python3-sqlalchemy \
 python3-tornado \
 keylime-base \
 python3-gpg \
 tpm2-tools \
 python3-alembic \
 python3-packaging \
 python3-jsonschema \
 python3-typing-extensions \
"
